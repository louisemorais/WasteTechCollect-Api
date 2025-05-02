package br.senai.lab365.futurodev.wasteTechCollect.controllers;

import br.senai.lab365.futurodev.wasteTechCollect.dtos.CollectionP.RequestCollectionP;
import br.senai.lab365.futurodev.wasteTechCollect.dtos.CollectionP.ResponseCollectionP;
import br.senai.lab365.futurodev.wasteTechCollect.dtos.ElectronicW.RequestElectW;
import br.senai.lab365.futurodev.wasteTechCollect.dtos.ElectronicW.ResponseElectW;
import br.senai.lab365.futurodev.wasteTechCollect.models.CollectionPoint;
import br.senai.lab365.futurodev.wasteTechCollect.services.CollectionPointService;
import br.senai.lab365.futurodev.wasteTechCollect.services.EletronicWaste.ElectronicWasteServices;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("collectionPoints")
@RestController
@RequiredArgsConstructor
public class CollectionPointController {

    private final CollectionPointService service;

    @GetMapping
    public List<ResponseCollectionP> findAll() {

        return service.findAll();
    }

    @GetMapping({"{id}"})
    public ResponseCollectionP findById(@PathVariable Long id) {

        return service.findById(id);
    }

    @GetMapping("/electronicWaste/name/{name}")
    public ResponseEntity<List<ResponseCollectionP>> getByElectronicWasteName(@PathVariable String name) {
        List<ResponseCollectionP> results = service.findByName(name);
        return ResponseEntity.status(HttpStatus.OK).body(results);
    }

    @PostMapping
    public ResponseCollectionP save(@RequestBody RequestCollectionP dto) {
        return service.creates(dto);
    }

    @PutMapping("{id}")
    public  ResponseCollectionP update( @PathVariable Long id,@RequestBody RequestCollectionP dto) {
        return service.update(id, dto);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable Long id) {

        service.delete(id);
    }
}