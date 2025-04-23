package br.senai.lab365.futurodev.wasteTechCollect.controllers;

import br.senai.lab365.futurodev.wasteTechCollect.dtos.ElectronicW.RequestElectW;
import br.senai.lab365.futurodev.wasteTechCollect.dtos.ElectronicW.ResponseElectW;
import br.senai.lab365.futurodev.wasteTechCollect.services.ElectronicWasteServices;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("electronic-wastes")
@RestController
@RequiredArgsConstructor
public class ElectronicWasteController {

    private final ElectronicWasteServices service;

    @GetMapping
    public List<ResponseElectW> findAll() {
        return service.findAll();
    }

    @GetMapping({"{id}"})
    public ResponseElectW findById(@PathVariable Long id) {
        return service.findById(id);
    }

    @PostMapping
    public ResponseElectW save(@RequestBody RequestElectW dto) {
        return service.create(dto);
    }

    @PutMapping("{id}")
    public  ResponseElectW update( @PathVariable Long id,@RequestBody RequestElectW dto) {
        return service.update(id, dto);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}