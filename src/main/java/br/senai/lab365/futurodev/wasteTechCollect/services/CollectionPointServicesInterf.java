package br.senai.lab365.futurodev.wasteTechCollect.services;

import br.senai.lab365.futurodev.wasteTechCollect.dtos.CollectionP.RequestCollectionP;
import br.senai.lab365.futurodev.wasteTechCollect.dtos.CollectionP.ResponseCollectionP;

import java.util.List;

public interface CollectionPointServicesInterf {
    List<ResponseCollectionP> findAll();
    ResponseCollectionP findById(Long id);
    List<ResponseCollectionP> findByName(String name);
    ResponseCollectionP creates(RequestCollectionP dto);
    ResponseCollectionP update(Long id, RequestCollectionP dto);
    void delete(Long id);

}
