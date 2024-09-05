package org.example.autoriknjiga.controller;

import lombok.RequiredArgsConstructor;
import org.example.autoriknjiga.entity.Autor;
import org.example.autoriknjiga.service.AutorService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(path="/autor")
@RequiredArgsConstructor
public class AutorController {

   private final AutorService service;

    @GetMapping
       public List<Autor> getAllAutor() {
          return service.getAllAutor();
                           }

   @GetMapping(path = "/{id}")
    public ResponseEntity<Autor> getAutorById(@PathVariable Integer id) {
            return ResponseEntity.of(service.getAutorById(id));
   }
   @GetMapping(path = "/email/{email}")
    public ResponseEntity<Autor> getAutorByEmail(@PathVariable String email) {
        return ResponseEntity.of(service.getAutorByEmail(email));
   }

   @PostMapping
    public Autor createAutor(@RequestBody Autor autor) {
        return service.createAutor(autor);
   }

   @PutMapping(path = "/{id}")
    public Autor updateAutor(@PathVariable Integer id, @RequestBody Autor autor) {
        return service.updateAutor(id, autor);
   }

   @DeleteMapping(path="/{id}")
    public void deleteAutor(@PathVariable Integer id) {
        service.deleteAutor(id);
   }



}
