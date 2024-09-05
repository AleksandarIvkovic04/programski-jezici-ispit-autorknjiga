package org.example.autoriknjiga.controller;

import lombok.RequiredArgsConstructor;
import org.example.autoriknjiga.entity.Knjiga;
import org.example.autoriknjiga.service.KnjigaService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(path = "/knjiga")
@RequiredArgsConstructor
public class KnjigaController {

    private final KnjigaService service;

    @GetMapping
    public List<Knjiga> getKnjiga() {
        return service.getAllKnjiga();
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<Knjiga> getKnjigaById(@PathVariable Integer id) {
        return ResponseEntity.of(service.getKnjigaById(id));
    }

    @GetMapping(path = "/zanr/{zanr}")
    public List<Knjiga> getKnjigaByZanr(@PathVariable String zanr) {
        return service.getKnjigaByZanr(zanr);
    }

    @PostMapping
    public Knjiga createKnjiga(@RequestBody Knjiga knjiga) {
        return service.createKnjiga(knjiga);
    }

    @PutMapping(path = "/{id}")
    public Knjiga updateKnjiga(@PathVariable Integer id, @RequestBody Knjiga knjiga) {
        return service.updateKnjiga(id, knjiga);
    }

    @DeleteMapping(path = "/{id}")
    public void deleteKnjiga(@PathVariable Integer id) {
        service.deleteKnjiga(id);
    }


}
