package br.senai.lab365.futurodev.wasteTechCollect.models;

import br.senai.lab365.futurodev.wasteTechCollect.models.EletronicEnum.WasteType;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "Electronic_wastes")
@Getter@Setter
public class ElectronicWaste {
    @Id@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "WasteType",nullable = false)
    @Enumerated(EnumType.STRING)
    private WasteType wasteType;

    @Column(name ="Description", length = 255)
    private String description;
}
