package org.example.autoriknjiga.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;


@Entity(name="autor")
@NoArgsConstructor
@Getter
@Setter
public class Autor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "autor_id")
    private Integer id;

    private String ime;
    private String prezime;
    @Column(name = "datum_rodjenja")
    private Date datumrodjenja;
    private String email;

    @JsonIgnore
    @OneToMany(mappedBy = "autor")
    private List<Knjiga> knjige;
}
