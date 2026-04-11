package tn.esprit.gestion_foyer.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.gestion_foyer.Entities.Universite;

public interface IUniversiteRepository extends JpaRepository<Universite, Long> {}