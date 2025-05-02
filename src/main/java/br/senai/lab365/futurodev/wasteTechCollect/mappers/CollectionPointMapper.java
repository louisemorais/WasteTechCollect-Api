package br.senai.lab365.futurodev.wasteTechCollect.mappers;


import br.senai.lab365.futurodev.wasteTechCollect.dtos.CollectionP.RequestCollectionP;
import br.senai.lab365.futurodev.wasteTechCollect.dtos.CollectionP.ResponseCollectionP;
import br.senai.lab365.futurodev.wasteTechCollect.models.AcceptedMaterial;
import br.senai.lab365.futurodev.wasteTechCollect.models.CollectionPoint;
import br.senai.lab365.futurodev.wasteTechCollect.models.ElectronicWaste;

import java.util.List;
import java.util.Optional;

public class CollectionPointMapper {
    private CollectionPointMapper() {}

    public static CollectionPoint toEntity(CollectionPoint entity, RequestCollectionP request) {
        entity.setName(request.name());
        entity.setAddress(request.address());
        entity.setCollectionDay(request.collectionDay());
        entity.setMaterials(Optional.ofNullable(request.materials())
                .orElse(List.of()).stream()
                .map(matDto -> {
                    var ew = new ElectronicWaste();
                    ew.setId(matDto.responseElectW_id());

                    var material = new AcceptedMaterial();
                    material.setMaxCapacity(matDto.maxCapacity());
                    material.setElectronicWaste(ew);
                    material.setCollectionPoint(entity); // ESSENCIAL

                    return material;
                }).toList()
        );

        return entity;
    }

    public static ResponseCollectionP toResponseDTO(CollectionPoint entity){
        return new ResponseCollectionP(
                entity.getId(),
                entity.getName(),
                entity.getAddress(),
                entity.getCollectionDay(),
                AcceptedMaterialMapper.toResponseDtos(entity.getMaterials())
        );
    }
    public static List<ResponseCollectionP> toResponseDtos(List<CollectionPoint> entities) {
        return entities.stream().map(CollectionPointMapper::toResponseDTO).toList();
    }
}
