package tn.esprit.spring.DAO.Entities;


import jakarta.persistence.*;
import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import lombok.*;

import lombok.Data;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder


@Entity
@Table(name="Skieur")
public class Skieur {

    @Id
    @Column(name="numSkieur")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id;

    private String nomS;

    private String prenomS;

    private LocalDate dataNaissance;


    private String ville;

@OneToMany(mappedBy = "skieur")
    private Set<Inscription> listInscription;

@ManyToMany
    private Set<Piste>  listPiste;

@OneToOne
    private Abonnement abonnement;

}