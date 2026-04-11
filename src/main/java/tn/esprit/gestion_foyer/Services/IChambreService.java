package tn.esprit.gestion_foyer.Services;

import tn.esprit.gestion_foyer.Entities.Chambre;
import java.util.List;

public interface IChambreService {
    List<Chambre> findAll();
    Chambre findById(long id);
    Chambre addOrUpdate(Chambre c);
    void delete(long id);
}