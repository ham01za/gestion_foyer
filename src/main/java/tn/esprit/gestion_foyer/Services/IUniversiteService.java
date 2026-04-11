package tn.esprit.gestion_foyer.Services;

import tn.esprit.gestion_foyer.Entities.Universite;
import java.util.List;

public interface IUniversiteService {
    List<Universite> findAll();
    Universite findById(long id);
    Universite addOrUpdate(Universite u);
    void delete(long id);
}