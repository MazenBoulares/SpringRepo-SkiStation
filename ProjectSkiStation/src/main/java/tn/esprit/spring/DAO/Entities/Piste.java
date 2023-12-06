package tn.esprit.spring.DAO.Entities;


import jakarta.persistence.*;

import lombok.*;

import tn.esprit.spring.DAO.Entities.ENUM.Couleur;

import java.util.Set;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder


@Entity
@Table(name="Piste")
public class Piste {

    @Id
    @Column(name="numPiste")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id;

    private String nomPiste;

    @Enumerated(EnumType.STRING)
    private Couleur colour;

    private int longeur;

    private int pente;


    @ManyToMany
    private Set<Skieur> listSkieur;




}