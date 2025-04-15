package br.senai.lab365.futurodev.wasteTechCollect.models;

import br.senai.lab365.futurodev.wasteTechCollect.models.EletronicEnum.WasteType;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "EletronicWastes")
@Getter@Setter
public class EletronicWaste {
    @Id@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "wasteType",nullable = false)
    @Enumerated(EnumType.STRING)
    private WasteType wasteType;

    @Column(name ="description", length = 255)
    private String description;
}
