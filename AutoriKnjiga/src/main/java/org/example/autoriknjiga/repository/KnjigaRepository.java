package org.example.autoriknjiga.repository;


import org.example.autoriknjiga.entity.Knjiga;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface KnjigaRepository extends JpaRepository<Knjiga, Integer> {

    List<Knjiga> findByZanr(String zanr);

}
