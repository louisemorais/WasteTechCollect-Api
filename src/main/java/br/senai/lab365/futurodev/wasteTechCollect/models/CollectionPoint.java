package br.senai.lab365.futurodev.wasteTechCollect.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Collection_points")
@Getter
@Setter
public class CollectionPoint {
    @Id@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "Name", length = 255, nullable = false )
    private String name;

    @Column(name = "Address", nullable = false )
    private String address;

    @Column(name = "Collection_day", nullable = false)
    private LocalDate collectionDay;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "collectionPoint", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<AcceptedMaterial> materials=new ArrayList<>();

}
