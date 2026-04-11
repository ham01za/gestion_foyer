package tn.esprit.gestion_foyer.Services;

import tn.esprit.gestion_foyer.Entities.Bloc;
import java.util.List;

public interface IBlocService {
    List<Bloc> findAll();
    Bloc findById(long id);
    Bloc addOrUpdate(Bloc b);
    void delete(long id);
}