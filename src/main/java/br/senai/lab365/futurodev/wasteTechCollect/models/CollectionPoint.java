package br.senai.lab365.futurodev.wasteTechCollect.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "CollectionPoints")
@Getter
@Setter
public class CollectionPoint {
    @Id@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "Name", length = 255, nullable = false )
    private String name;

    @Column(name = "Adress", nullable = false )
    private String adress;

    @Column(name = "CollectionDay", nullable = false)
    private LocalDate collectionDay;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "CollectionPoint", cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "AcceptedMaterial_id", nullable = false)
    private List<AcceptedMaterial> materials=new ArrayList<>();

}
