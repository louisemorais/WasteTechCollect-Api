package br.senai.lab365.futurodev.wasteTechCollect.services.EletronicWaste;

import br.senai.lab365.futurodev.wasteTechCollect.dtos.ElectronicW.RequestElectW;
import br.senai.lab365.futurodev.wasteTechCollect.dtos.ElectronicW.ResponseElectW;

import java.util.List;

public interface ElectronicWasteServicesInterf {
    List<ResponseElectW> findAll();
    ResponseElectW findById(Long id);
    ResponseElectW create(RequestElectW requestDto);
    ResponseElectW update(Long id,RequestElectW requestDto);
    void delete(Long id);
}
