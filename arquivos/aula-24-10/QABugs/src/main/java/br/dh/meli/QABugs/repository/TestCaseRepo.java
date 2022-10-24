package br.dh.meli.QABugs.repository;

import br.dh.meli.QABugs.model.TestCase;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;

public interface TestCaseRepo extends JpaRepository<TestCase, Long> {
    List<TestCase> findTestCaseByLastUpdateGreaterThanEqual(Date data);
}
