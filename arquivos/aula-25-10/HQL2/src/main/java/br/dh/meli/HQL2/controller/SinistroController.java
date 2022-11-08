package br.dh.meli.HQL2.controller;

import br.dh.meli.HQL2.model.Sinistro;
import br.dh.meli.HQL2.model.Veiculo;
import br.dh.meli.HQL2.service.SinistroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/sinistro")
public class SinistroController {

    @Autowired
    private SinistroService service;
    @PostMapping
    ResponseEntity<Sinistro> Insert(@RequestBody Sinistro sinistro) {
        Sinistro newSinistro = service.insert(sinistro);
        return new ResponseEntity<>(newSinistro, HttpStatus.OK);
    }

    @DeleteMapping
    ResponseEntity<Void> Delete() {
        service.delete();
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
