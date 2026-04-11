package tn.esprit.gestion_foyer.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.gestion_foyer.Entities.Etudiant;
import tn.esprit.gestion_foyer.Repositories.IEtudiantRepository;
import java.util.List;

@Service
@AllArgsConstructor
public class EtudiantServiceImpl implements IEtudiantService {

    IEtudiantRepository etudiantRepository;

    @Override
    public List<Etudiant> findAll() { return etudiantRepository.findAll(); }

    @Override
    public Etudiant findById(long id) { return etudiantRepository.findById(id).orElse(null); }

    @Override
    public Etudiant addOrUpdate(Etudiant e) { return etudiantRepository.save(e); }

    @Override
    public void delete(long id) { etudiantRepository.deleteById(id); }
}