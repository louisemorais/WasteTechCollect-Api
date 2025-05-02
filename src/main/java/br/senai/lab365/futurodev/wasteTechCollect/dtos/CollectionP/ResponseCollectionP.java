package br.senai.lab365.futurodev.wasteTechCollect.dtos.CollectionP;

import br.senai.lab365.futurodev.wasteTechCollect.dtos.AcceptedM.ResponseAcceptedM;
import br.senai.lab365.futurodev.wasteTechCollect.models.AcceptedMaterial;

import java.time.LocalDate;
import java.util.List;

public record ResponseCollectionP(Long id,
                                  String name,
                                  String address,
                                  LocalDate collectionDay,
                                  List<ResponseAcceptedM> materials) { }
