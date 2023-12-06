package tn.esprit.spring.DAO.Entities;


import jakarta.persistence.*;
import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

import lombok.*;

import lombok.Data;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder


@Entity
@Table(name="Inscription")
public class Inscription {

    @Id
    @Column(name="numInscription")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id;

    private int numSemaine;


@ManyToOne
    private Skieur skieur;

@ManyToOne
    private Cours cours;


}