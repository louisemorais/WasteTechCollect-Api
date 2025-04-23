package br.senai.lab365.futurodev.wasteTechCollect.dtos.CollectionP;

import br.senai.lab365.futurodev.wasteTechCollect.dtos.AcceptedM.RequestAcceptedM;

import java.time.LocalDate;
import java.util.List;

public record RequestCollectionP(String name,
                                 String address,
                                 LocalDate collectionDay,
                                 List<RequestAcceptedM> materials) { }
