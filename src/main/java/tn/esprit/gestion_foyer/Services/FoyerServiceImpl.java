package tn.esprit.gestion_foyer.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.gestion_foyer.Entities.Foyer;
import tn.esprit.gestion_foyer.Repositories.IFoyerRepository;
import java.util.List;

@Service
@AllArgsConstructor
public class FoyerServiceImpl implements IFoyerService {

    IFoyerRepository foyerRepository;

    @Override
    public List<Foyer> findAll() { return foyerRepository.findAll(); }

    @Override
    public Foyer findById(long id) { return foyerRepository.findById(id).orElse(null); }

    @Override
    public Foyer addOrUpdate(Foyer f) { return foyerRepository.save(f); }

    @Override
    public void delete(long id) { foyerRepository.deleteById(id); }
}