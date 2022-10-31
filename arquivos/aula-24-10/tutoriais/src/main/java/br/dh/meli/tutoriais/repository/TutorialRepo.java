package br.dh.meli.tutoriais.repository;


import br.dh.meli.tutoriais.model.Tutorial;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TutorialRepo extends JpaRepository<Tutorial, Long> {
}
