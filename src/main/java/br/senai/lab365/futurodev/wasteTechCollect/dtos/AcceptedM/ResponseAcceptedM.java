package br.senai.lab365.futurodev.wasteTechCollect.dtos.AcceptedM;

import br.senai.lab365.futurodev.wasteTechCollect.dtos.ElectronicW.ResponseElectW;

import java.math.BigDecimal;

public record ResponseAcceptedM(Long id,
                                ResponseElectW responseElectW,
                                BigDecimal maxCapacity) { }
