package br.dh.meli.storage02.controller;

import br.dh.meli.storage02.model.Subject;
import br.dh.meli.storage02.service.ISubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/subject")
public class SubjectController {
    @Autowired
    private ISubjectService service;

    @GetMapping("/{id}")
    public ResponseEntity<Subject> getById(@PathVariable long id) {
        Subject subject = service.findById(id);
        if(subject != null) {
            return ResponseEntity.ok(subject);
        }
    }
}
