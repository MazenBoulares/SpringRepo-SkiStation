package tn.esprit.spring.DAO.Services;

import tn.esprit.spring.DAO.Entities.Piste;

import java.util.List;

public interface iPisteService {

    Piste addPiste(Piste b);
    List<Piste> addAllPistes(List<Piste> Pistes);
    Piste updatePiste(Piste b);
    List<Piste> findAllPistes();
    Piste findPisteById(long id);
    void deletePiste(Piste b);
    void deletePisteById(long id);
//    void deletePisteById(long id);
//    Optional<Piste>  findPisteByID2(long id);
}
