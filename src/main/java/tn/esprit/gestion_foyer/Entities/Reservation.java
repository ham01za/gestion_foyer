package tn.esprit.gestion_foyer.Entities;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
public class Reservation {

    @Id
    private String idReservation;

    private LocalDate anneeUniversitaire;
    private boolean estValide;
    @ManyToOne
    private Chambre chambre;

    @ManyToMany
    private List<Etudiant> etudiants;
}