package br.dh.meli.QABugs.service;

import br.dh.meli.QABugs.model.TestCase;
import br.dh.meli.QABugs.repository.TestCaseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.Date;
import java.util.List;
import java.util.Optional;


@Service
public class TestCaseService {
    @Autowired
    private TestCaseRepo repo;

    public List<TestCase> getAll() {
        List<TestCase> testCase = repo.findAll();
        return testCase;
    }
    public TestCase findById(long id) {
        Optional<TestCase> optionalTestCase = repo.findById(id);
        return optionalTestCase.orElse(null);
    }

    public List<TestCase> findByDate(Date data) {
        List<TestCase> testCaseList = repo.findTestCaseByLastUpdateGreaterThanEqual(data);

        return testCaseList;
    }

    public TestCase created(TestCase testCase) {
        TestCase newTestCase = repo.save(testCase);
        return newTestCase;
    }

    public TestCase update(TestCase testCase, long id){
        Optional <TestCase> optionalTestCase = repo.findById(id);
        TestCase updateTestCase = optionalTestCase.get();

        updateTestCase.setDescription(testCase.getDescription());
        updateTestCase.setTested(testCase.isTested());
        updateTestCase.setLastUpdate(testCase.getLastUpdate());
        updateTestCase.setPassed(testCase.isPassed());
        updateTestCase.setNumber_of_tries(testCase.getNumber_of_tries());

        return repo.save(updateTestCase);
    }

    public void delete(long id) {
        repo.deleteById(id);
    }
}
