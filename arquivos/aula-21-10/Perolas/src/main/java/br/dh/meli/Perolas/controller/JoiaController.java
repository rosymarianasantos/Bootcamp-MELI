package br.dh.meli.Perolas.controller;

import br.dh.meli.Perolas.model.JoiaBD;
import br.dh.meli.Perolas.service.JoiaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/joia")
public class JoiaController {
    @Autowired
    private JoiaService service;

    @PostMapping("/inserir")
    public ResponseEntity<JoiaBD> novaJoia(@RequestBody JoiaBD joia) {
        JoiaBD novaJoia = service.inserir(joia);
        return new ResponseEntity<>(novaJoia, HttpStatus.CREATED);
    }

    @GetMapping()
    public Iterable<JoiaBD> findAll() {
        Iterable<JoiaBD> listarJoias = service.findJoias();
        return listarJoias;
    }
    @PutMapping("atualizar")
    public ResponseEntity<JoiaBD> update(@RequestParam long codigo, @RequestBody JoiaBD joia) {
        JoiaBD joiaUp = service.update(codigo, joia);
        return new ResponseEntity<>(joiaUp, HttpStatus.OK);
    }
    @DeleteMapping("excluir")
    public ResponseEntity<Void> delete(@RequestParam long codigo) {
        service.delete(codigo);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
