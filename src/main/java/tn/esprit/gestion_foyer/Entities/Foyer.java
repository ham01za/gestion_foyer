package tn.esprit.gestion_foyer.Entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
public class Foyer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idFoyer;

    private String nomFoyer;
    private long capaciteFoyer;
}