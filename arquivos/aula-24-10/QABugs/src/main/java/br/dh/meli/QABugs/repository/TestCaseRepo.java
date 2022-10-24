package br.dh.meli.QABugs.repository;

import br.dh.meli.QABugs.model.TestCase;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TestCaseRepo extends JpaRepository<TestCase, Long> {
}
