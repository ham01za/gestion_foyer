package tn.esprit.gestion_foyer.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.gestion_foyer.Entities.Reservation;

public interface IReservationRepository extends JpaRepository<Reservation, String> {}