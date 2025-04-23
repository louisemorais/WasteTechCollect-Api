package br.senai.lab365.futurodev.wasteTechCollect.mappers;

import br.senai.lab365.futurodev.wasteTechCollect.dtos.ElectronicW.RequestElectW;
import br.senai.lab365.futurodev.wasteTechCollect.dtos.ElectronicW.ResponseElectW;
import br.senai.lab365.futurodev.wasteTechCollect.models.ElectronicWaste;

public class ElectronicWasteMapper {
    private ElectronicWasteMapper() {}

    public static ElectronicWaste toEntity(ElectronicWaste entity, RequestElectW request) {
        entity.setWasteType(request.wasteType());
        entity.setDescription(request.description());
        return entity;
    }

    public static ResponseElectW toResponseDTO(ElectronicWaste entity){
        return new ResponseElectW(
                entity.getId(),
                entity.getWasteType(),
                entity.getDescription()
        );
    }
}
