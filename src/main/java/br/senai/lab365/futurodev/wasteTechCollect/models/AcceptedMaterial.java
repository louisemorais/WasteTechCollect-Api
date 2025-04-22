package br.senai.lab365.futurodev.wasteTechCollect.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@Table(name = "AcceptedMaterials")
@Getter
@Setter
public class AcceptedMaterial {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CollectionPoints_id", nullable = false)
    private CollectionPoint collectionPoints;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "EletronicWastes_id", nullable = false)
    private ElectronicWaste eletronicWastets;

    @Column(name = "Max_Capacity", nullable = false)
    private BigDecimal maxCapacity;
}
