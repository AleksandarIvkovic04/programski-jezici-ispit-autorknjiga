package org.example.autoriknjiga.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity(name="knjiga")
@NoArgsConstructor
@Getter
@Setter
public class Knjiga {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "knjiga_id")
    private Integer id;


    @ManyToOne()
    @JoinColumn(name = "autor_id", nullable = false)
    private Autor autor;

    private String naziv;
    @Column(name="datum_izlaska")
    private Date datumIzlaska;
    @Column(name = "broj_strana")
    private Integer brojStrana;
    private String zanr;
}
