package org.example.autoriknjiga.service;

import lombok.RequiredArgsConstructor;
import org.example.autoriknjiga.entity.Autor;
import org.example.autoriknjiga.entity.Knjiga;
import org.example.autoriknjiga.repository.AutorRepository;
import org.example.autoriknjiga.repository.KnjigaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class KnjigaService {

    private final KnjigaRepository repository;


    public List<Knjiga> getAllKnjiga() {
        return repository.findAll();
    }

    public Optional<Knjiga> getKnjigaById(Integer id) {
        return repository.findById(id);
    }

    public List<Knjiga> getKnjigaByZanr(String zanr) {
        return repository.findByZanr(zanr);
    }

    public Knjiga createKnjiga(Knjiga knjiga) {
        knjiga.setId(null);
        return repository.save(knjiga);
    }

    public Knjiga updateKnjiga(Integer id,Knjiga knjiga) {
        knjiga.setId(id);
        return repository.save(knjiga);
    }

    public void deleteKnjiga(Integer id) {
        repository.deleteById(id);
    }

  



}
