package org.example.autoriknjiga.service;

import lombok.RequiredArgsConstructor;
import org.example.autoriknjiga.entity.Autor;
import org.example.autoriknjiga.repository.AutorRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AutorService {

    private final AutorRepository repository;

    public List<Autor> getAllAutor(){
        return repository.findAll();
    }

    public Optional<Autor> getAutorById(Integer id){
        return repository.findById(id);
    }
    public Optional<Autor> getAutorByEmail(String email){
        return repository.findByEmail(email);
}
    public Autor createAutor(Autor autor){
        autor.setId(null);
        return repository.save(autor);
    }

    public Autor updateAutor(Integer id, Autor autor){
        autor.setId(id);
        return repository.save(autor);
    }

    public void deleteAutor(Integer id){
       Optional<Autor> autor = repository.findById(id);
       repository.delete(autor.get());
    }


}
