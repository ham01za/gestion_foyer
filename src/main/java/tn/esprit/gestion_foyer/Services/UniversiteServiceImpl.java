package tn.esprit.gestion_foyer.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.gestion_foyer.Entities.Universite;
import tn.esprit.gestion_foyer.Repositories.IUniversiteRepository;
import java.util.List;

@Service
@AllArgsConstructor
public class UniversiteServiceImpl implements IUniversiteService {

    IUniversiteRepository universiteRepository;

    @Override
    public List<Universite> findAll() {
        return universiteRepository.findAll();
    }

    @Override
    public Universite findById(long id) {
        return universiteRepository.findById(id).orElse(null);
    }

    @Override
    public Universite addOrUpdate(Universite u) {
        return universiteRepository.save(u);
    }

    @Override
    public void delete(long id) {
        universiteRepository.deleteById(id);
    }
}