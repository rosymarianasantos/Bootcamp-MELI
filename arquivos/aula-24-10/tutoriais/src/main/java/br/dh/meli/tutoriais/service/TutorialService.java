package br.dh.meli.tutoriais.service;


import br.dh.meli.tutoriais.model.Tutorial;
import br.dh.meli.tutoriais.repository.TutorialRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TutorialService implements ITutorialService {
    @Autowired
    private TutorialRepo repo;

    public List<Tutorial> getAll() {
        List<Tutorial> tutorialList = repo.findAll();
        return tutorialList;
    }

    public Tutorial findById(Long id) {
        Optional<Tutorial> optionalTutorial = repo.findById(id);
        return optionalTutorial.orElse(null);
    }

    public Tutorial created(Tutorial tutorial) {
        Tutorial newTutorial = repo.save(tutorial);
        return newTutorial;
    }

    public Tutorial update(Tutorial tutorial, Long id) {
        Optional<Tutorial> optionalTutorial = repo.findById(id);
        Tutorial updateTutorial = optionalTutorial.get();

        updateTutorial.setTitle(tutorial.getTitle());
            updateTutorial.setDescription(tutorial.getDescription());
        updateTutorial.setStatus(tutorial.getStatus());


        return repo.save(updateTutorial);
    }

    public void deleteAll() {
        repo.deleteAll();
    }

    public void deleteById(Long id) {
        repo.deleteById(id);
    }
}
