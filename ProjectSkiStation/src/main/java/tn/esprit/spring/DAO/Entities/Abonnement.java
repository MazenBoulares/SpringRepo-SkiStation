package tn.esprit.spring.DAO.Entities;


import jakarta.persistence.*;

import java.time.LocalDate;

import lombok.*;

import tn.esprit.spring.DAO.Entities.ENUM.TypeAbonnement;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder


@Entity
@Table(name="Abonnement")
public class Abonnement {

    @Id
    @Column(name="numAbonnement")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id;


private float prixAbon;
private LocalDate DateDebut;

private LocalDate dateFin;

@Enumerated(EnumType.STRING)
private TypeAbonnement typeAbon;

@OneToOne
private Skieur skieur;




}