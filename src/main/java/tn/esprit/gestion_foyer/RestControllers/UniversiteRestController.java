package tn.esprit.gestion_foyer.RestControllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.gestion_foyer.Entities.Universite;
import tn.esprit.gestion_foyer.Services.IUniversiteService;
import java.util.List;

@RestController
@RequestMapping("/universite")
@AllArgsConstructor
public class UniversiteRestController {

    IUniversiteService universiteService;

    @GetMapping("/findAll")
    public List<Universite> findAll() {
        return universiteService.findAll();
    }

    @GetMapping("/findById/{id}")
    public Universite findById(@PathVariable long id) {
        return universiteService.findById(id);
    }

    @PostMapping("/addOrUpdate")
    public Universite addOrUpdate(@RequestBody Universite u) {
        return universiteService.addOrUpdate(u);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable long id) {
        universiteService.delete(id);
    }
}