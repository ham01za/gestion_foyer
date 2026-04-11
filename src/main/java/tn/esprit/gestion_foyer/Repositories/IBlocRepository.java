package tn.esprit.gestion_foyer.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.gestion_foyer.Entities.Bloc;

public interface IBlocRepository extends JpaRepository<Bloc, Long> {}