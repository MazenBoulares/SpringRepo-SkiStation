package tn.esprit.spring.Services;


import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.spring.DAO.Entities.Piste;
import tn.esprit.spring.DAO.Repositories.PisteRepository;
import tn.esprit.spring.DAO.Services.iPisteService;

import java.util.List;


@Service // Indicates that this class is a Spring service and should be treated as a bean
@AllArgsConstructor //Spring will automatically inject the PisteRepository bean into the
public class PisteService implements iPisteService{

    PisteRepository PisteRepository;

    @Override
    public Piste addPiste(Piste b){
        return PisteRepository.save(b);
    }

    @Override
    public List<Piste> addAllPistes(List<Piste> Pistes){
        return PisteRepository.saveAll(Pistes);
    }

    @Override
    public Piste updatePiste(Piste b){
        return PisteRepository.save(b);
    };

    @Override
    public List<Piste> findAllPistes(){
        return PisteRepository.findAll();
    };



    public List<Piste> UpdateAllPistes(List<Piste> Pistes){
        return PisteRepository.saveAll(Pistes);
    };


    public Piste findPisteById(long id){
        return PisteRepository.findById(id).orElse(Piste.builder().id(0).build());

    };

        public void deletePiste(Piste b){
         PisteRepository.delete(b);
    };

//    Optional<Piste> findPisteByID2(long id);
//

public   void deletePisteById(long id){
    PisteRepository.deleteById(id);
};



}
