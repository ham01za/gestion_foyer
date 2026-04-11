package tn.esprit.gestion_foyer.RestControllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.gestion_foyer.Entities.Chambre;
import tn.esprit.gestion_foyer.Services.IChambreService;
import java.util.List;

@RestController
@RequestMapping("/chambre")
@AllArgsConstructor
public class ChambreRestController {

    IChambreService chambreService;

    @GetMapping("/findAll")
    public List<Chambre> findAll() {
        return chambreService.findAll();
    }

    @GetMapping("/findById/{id}")
    public Chambre findById(@PathVariable long id) {
        return chambreService.findById(id);
    }

    @PostMapping("/addOrUpdate")
    public Chambre addOrUpdate(@RequestBody Chambre c) {
        return chambreService.addOrUpdate(c);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable long id) {
        chambreService.delete(id);
    }
}