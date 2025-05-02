package br.senai.lab365.futurodev.wasteTechCollect.mappers;

import br.senai.lab365.futurodev.wasteTechCollect.dtos.AcceptedM.ResponseAcceptedM;
import br.senai.lab365.futurodev.wasteTechCollect.models.AcceptedMaterial;

import java.util.List;

public class AcceptedMaterialMapper {
    private AcceptedMaterialMapper() {}

    public static ResponseAcceptedM toResponseDTO(AcceptedMaterial entity) {
        return new ResponseAcceptedM(
                entity.getId(),
                ElectronicWasteMapper.toResponseDTO(entity.getElectronicWaste()),
                entity.getMaxCapacity()
        );
    }

    public static List<ResponseAcceptedM> toResponseDtos(List<AcceptedMaterial> entities) {
        return entities.stream().map(AcceptedMaterialMapper::toResponseDTO).toList();
    }
}
