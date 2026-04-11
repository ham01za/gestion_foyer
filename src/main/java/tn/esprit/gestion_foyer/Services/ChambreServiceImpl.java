package tn.esprit.gestion_foyer.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.gestion_foyer.Entities.Chambre;
import tn.esprit.gestion_foyer.Repositories.IChambreRepository;
import java.util.List;

@Service
@AllArgsConstructor
public class ChambreServiceImpl implements IChambreService {

    IChambreRepository chambreRepository;

    @Override
    public List<Chambre> findAll() { return chambreRepository.findAll(); }

    @Override
    public Chambre findById(long id) { return chambreRepository.findById(id).orElse(null); }

    @Override
    public Chambre addOrUpdate(Chambre c) { return chambreRepository.save(c); }

    @Override
    public void delete(long id) { chambreRepository.deleteById(id); }
}