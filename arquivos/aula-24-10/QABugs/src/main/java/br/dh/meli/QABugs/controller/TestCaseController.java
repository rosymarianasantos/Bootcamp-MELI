package br.dh.meli.QABugs.controller;

import br.dh.meli.QABugs.model.TestCase;
import br.dh.meli.QABugs.service.TestCaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.persistence.GeneratedValue;
import java.util.List;

@RestController
@RequestMapping("/api/testcases")
public class TestCaseController {
    @Autowired
    private TestCaseService service;

    @PostMapping("/new")
    public ResponseEntity<TestCase> created(@RequestBody TestCase testCase) {
        TestCase novoTestCase = service.created(testCase);
        return new ResponseEntity<>(novoTestCase, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<TestCase>> getAll() {
        List<TestCase> testCaseList = service.getAll();
        return new ResponseEntity<>(testCaseList, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<TestCase> getById(@PathVariable long id) {
        TestCase testCase = service.findById(id);
        return new ResponseEntity<>(testCase, HttpStatus.OK);
    }

    @GetMapping("/data")
    public ResponseEntity<List<TestCase>> findByDate(@RequestParam String last_update) {
        List<TestCase> testCaseList = service.findByDate(last_update);
        return new ResponseEntity<>(testCaseList, HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<TestCase> update(@PathVariable long id, @RequestBody TestCase testCase) {
        TestCase testCaseUpdate = service.update(testCase, id);
        return new ResponseEntity<>(testCaseUpdate, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable long id) {
        service.delete(id);

        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
