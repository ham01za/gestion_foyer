package tn.esprit.gestion_foyer.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.gestion_foyer.Entities.Bloc;
import tn.esprit.gestion_foyer.Repositories.IBlocRepository;
import java.util.List;

@Service
@AllArgsConstructor
public class BlocServiceImpl implements IBlocService {

    IBlocRepository blocRepository;

    @Override
    public List<Bloc> findAll() {
        return blocRepository.findAll();
    }

    @Override
    public Bloc findById(long id) {
        return blocRepository.findById(id).orElse(null);
    }

    @Override
    public Bloc addOrUpdate(Bloc b) {
        return blocRepository.save(b);
    }

    @Override
    public void delete(long id) {
        blocRepository.deleteById(id);
    }
}