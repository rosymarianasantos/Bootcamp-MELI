package br.dh.meli.tutoriais.controller;

import br.dh.meli.tutoriais.model.Tutorial;
import br.dh.meli.tutoriais.service.TutorialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tutorials")
public class TutorialController {
    @Autowired
    private TutorialService service;

    @PostMapping
    public ResponseEntity<Tutorial> created(@RequestBody Tutorial tutorial) {
        Tutorial novoTutorial = service.created(tutorial);
        return new ResponseEntity<>(novoTutorial, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Tutorial>> getAll() {
        List<Tutorial> tutorialList = service.getAll();
        return new ResponseEntity<>(tutorialList, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Tutorial> getById(@PathVariable Long id) {
        Tutorial tutorial = service.findById(id);
        return new ResponseEntity<>(tutorial, HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Tutorial> update(@PathVariable Long id, @RequestBody Tutorial tutorial) {
        Tutorial tutorialUpdate = service.update(tutorial, id);
        return new ResponseEntity<>(tutorialUpdate, HttpStatus.OK);
    }

    @DeleteMapping
    public ResponseEntity<Void> deleteAll() {
        service.deleteAll();
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable Long id) {
        service.deleteById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
