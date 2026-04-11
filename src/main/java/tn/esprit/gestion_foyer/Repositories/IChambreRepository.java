package tn.esprit.gestion_foyer.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.gestion_foyer.Entities.Chambre;

public interface IChambreRepository extends JpaRepository<Chambre, Long> {}