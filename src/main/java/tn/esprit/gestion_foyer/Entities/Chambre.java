package tn.esprit.gestion_foyer.Entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
public class Chambre {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idChambre;

    @Column(unique = true)
    private long numeroChambre;

    @Enumerated(EnumType.STRING)
    private TypeChambre typeC;
}

