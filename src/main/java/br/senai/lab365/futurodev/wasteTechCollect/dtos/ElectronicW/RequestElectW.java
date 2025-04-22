package br.senai.lab365.futurodev.wasteTechCollect.dtos.ElectronicW;

import br.senai.lab365.futurodev.wasteTechCollect.models.EletronicEnum.WasteType;

public record RequestElectW(WasteType wasteType,
                            String description) { }
