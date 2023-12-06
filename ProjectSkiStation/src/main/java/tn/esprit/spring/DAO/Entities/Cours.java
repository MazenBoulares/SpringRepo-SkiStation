package tn.esprit.spring.DAO.Entities;


import jakarta.persistence.*;
import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import lombok.*;

import lombok.Data;
import tn.esprit.spring.DAO.Entities.ENUM.Support;
import tn.esprit.spring.DAO.Entities.ENUM.TypeCours;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder


@Entity
@Table(name="Cours")
public class Cours {

    @Id
    @Column(name="numCours")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id;

    private int niveau;

    private TypeCours typeCours;

    private Support support;

    private float prix;

    private int creneau;

@OneToMany(mappedBy="cours")
    private Set<Inscription> listInscription;

    @ManyToOne
    private Moniteur moniteur;

}