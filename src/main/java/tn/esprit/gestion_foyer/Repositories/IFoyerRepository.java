package tn.esprit.gestion_foyer.Repositories;



import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.gestion_foyer.Entities.Foyer;

public interface IFoyerRepository extends JpaRepository<Foyer, Long> {}