package tn.esprit.gestion_foyer.Services;

import tn.esprit.gestion_foyer.Entities.Reservation;
import java.util.List;

public interface IReservationService {
    List<Reservation> findAll();
    Reservation findById(String id);
    Reservation addOrUpdate(Reservation r);
    void delete(String id);
}