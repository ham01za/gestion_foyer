package tn.esprit.gestion_foyer.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.gestion_foyer.Entities.Etudiant;

public interface IEtudiantRepository extends JpaRepository<Etudiant, Long> {}