package tn.esprit.gestion_foyer.Services;

import tn.esprit.gestion_foyer.Entities.Foyer;
import java.util.List;

public interface IFoyerService {
    List<Foyer> findAll();
    Foyer findById(long id);
    Foyer addOrUpdate(Foyer f);
    void delete(long id);
}