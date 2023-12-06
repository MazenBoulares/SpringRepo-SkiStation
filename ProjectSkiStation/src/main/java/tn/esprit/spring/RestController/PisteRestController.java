package tn.esprit.spring.RestController;

import lombok.AllArgsConstructor;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tn.esprit.spring.DAO.Entities.Piste;
import tn.esprit.spring.DAO.Services.iPisteService;

import java.util.List;


@RestController
@RequestMapping("pistes")
@AllArgsConstructor
public class PisteRestController {

    iPisteService iPisteService;
    @GetMapping
    public List<Piste> getAll(){
        return iPisteService.findAllPistes();
    }
    //@requestbody => on va passer un objet dans les parametres (json)
    // int,float, string => @ReqyestParam ou @PathVariable


    @GetMapping("/{id}")
    public Piste getById(@PathVariable long id) {

        return iPisteService.findPisteById(id);
    }

    @PostMapping
    public Piste addPiste(@RequestBody Piste Piste){
        return iPisteService.addPiste(Piste);
    }

    @PutMapping()
    public Piste updatePiste(@RequestBody Piste Piste){
        return iPisteService.updatePiste(Piste);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> updatePiste(@PathVariable long id){
        try { iPisteService.deletePisteById(id);
            return new ResponseEntity<>("Entity with ID " + id + " deleted successfully", HttpStatus.OK);
        } catch (EmptyResultDataAccessException e) {
            return new ResponseEntity<>("Entity with ID " + id + " not found", HttpStatus.NOT_FOUND);
        } catch (Exception e) {
            return new ResponseEntity<>("Error deleting entity with ID " + id, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }




}
