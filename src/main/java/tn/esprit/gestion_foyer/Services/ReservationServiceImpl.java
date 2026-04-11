package tn.esprit.gestion_foyer.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.gestion_foyer.Entities.Reservation;
import tn.esprit.gestion_foyer.Repositories.IReservationRepository;
import java.util.List;

@Service
@AllArgsConstructor
public class ReservationServiceImpl implements IReservationService {

    IReservationRepository reservationRepository;

    @Override
    public List<Reservation> findAll() { return reservationRepository.findAll(); }

    @Override
    public Reservation findById(String id) { return reservationRepository.findById(id).orElse(null); }

    @Override
    public Reservation addOrUpdate(Reservation r) { return reservationRepository.save(r); }

    @Override
    public void delete(String id) { reservationRepository.deleteById(id); }
}