package tn.esprit.gestion_foyer.RestControllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.gestion_foyer.Entities.Foyer;
import tn.esprit.gestion_foyer.Services.IFoyerService;
import java.util.List;

@RestController
@RequestMapping("/foyer")
@AllArgsConstructor
public class FoyerRestController {

    IFoyerService foyerService;

    @GetMapping("/findAll")
    public List<Foyer> findAll() {
        return foyerService.findAll();
    }

    @GetMapping("/findById/{id}")
    public Foyer findById(@PathVariable long id) {
        return foyerService.findById(id);
    }

    @PostMapping("/addOrUpdate")
    public Foyer addOrUpdate(@RequestBody Foyer f) {
        return foyerService.addOrUpdate(f);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable long id) {
        foyerService.delete(id);
    }
}