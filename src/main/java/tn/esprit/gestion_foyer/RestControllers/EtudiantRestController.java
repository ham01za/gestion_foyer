package tn.esprit.gestion_foyer.RestControllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.gestion_foyer.Entities.Etudiant;
import tn.esprit.gestion_foyer.Services.IEtudiantService;
import java.util.List;

@RestController
@RequestMapping("/etudiant")
@AllArgsConstructor
public class EtudiantRestController {

    IEtudiantService etudiantService;

    @GetMapping("/findAll")
    public List<Etudiant> findAll() {
        return etudiantService.findAll();
    }

    @GetMapping("/findById/{id}")
    public Etudiant findById(@PathVariable long id) {
        return etudiantService.findById(id);
    }

    @PostMapping("/addOrUpdate")
    public Etudiant addOrUpdate(@RequestBody Etudiant e) {
        return etudiantService.addOrUpdate(e);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable long id) {
        etudiantService.delete(id);
    }
}