package tn.esprit.gestion_foyer.Services;

import tn.esprit.gestion_foyer.Entities.Etudiant;
import java.util.List;

public interface IEtudiantService {
    List<Etudiant> findAll();
    Etudiant findById(long id);
    Etudiant addOrUpdate(Etudiant e);
    void delete(long id);
}