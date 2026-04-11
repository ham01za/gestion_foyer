package tn.esprit.gestion_foyer.RestControllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.gestion_foyer.Entities.Reservation;
import tn.esprit.gestion_foyer.Services.IReservationService;
import java.util.List;

@RestController
@RequestMapping("/reservation")
@AllArgsConstructor
public class ReservationRestController {

    IReservationService reservationService;

    @GetMapping("/findAll")
    public List<Reservation> findAll() {
        return reservationService.findAll();
    }

    @GetMapping("/findById/{id}")
    public Reservation findById(@PathVariable String id) {
        return reservationService.findById(id);
    }

    @PostMapping("/addOrUpdate")
    public Reservation addOrUpdate(@RequestBody Reservation r) {
        return reservationService.addOrUpdate(r);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable String id) {
        reservationService.delete(id);
    }
}
