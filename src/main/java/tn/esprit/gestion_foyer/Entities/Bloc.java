package tn.esprit.gestion_foyer.Entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
public class Bloc {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idBloc;

    private String nomBloc;
    private long capaciteBloc;
}