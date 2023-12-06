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
@Table(name="Moniteur")
public class Moniteur {

    @Id
    @Column(name="numMoniteur")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id;

    private String nomM;
    private String prenomM;

    private LocalDate dateRecru;

    @ManyToOne
    private Cours cours;


}