package br.senai.lab365.futurodev.wasteTechCollect.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@Table(name = "Accepted_materials")
@Getter
@Setter
public class AcceptedMaterial {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Collection_Points_id", nullable = false)
    private CollectionPoint collectionPoint;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Electronic_wastes_id", nullable = false)
    private ElectronicWaste electronicWaste;

    @Column(name = "Max_Capacity", nullable = false)
    private BigDecimal maxCapacity;
}
