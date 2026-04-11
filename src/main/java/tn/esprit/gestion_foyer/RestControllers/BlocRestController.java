package tn.esprit.gestion_foyer.RestControllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.gestion_foyer.Entities.Bloc;
import tn.esprit.gestion_foyer.Services.IBlocService;
import java.util.List;

@RestController
@RequestMapping("/bloc")
@AllArgsConstructor
public class BlocRestController {

    IBlocService blocService;

    @GetMapping("/findAll")
    public List<Bloc> findAll() {
        return blocService.findAll();
    }

    @GetMapping("/findById/{id}")
    public Bloc findById(@PathVariable long id) {
        return blocService.findById(id);
    }

    @PostMapping("/addOrUpdate")
    public Bloc addOrUpdate(@RequestBody Bloc b) {
        return blocService.addOrUpdate(b);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable long id) {
        blocService.delete(id);
    }
}