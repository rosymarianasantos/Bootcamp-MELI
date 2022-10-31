package br.dh.meli.tutoriais.service;

import br.dh.meli.tutoriais.model.Tutorial;

import java.util.List;

public interface ITutorialService {
    public List<Tutorial> getAll();

    public Tutorial findById(Long id);

    public Tutorial created(Tutorial tutorial);

    public Tutorial update(Tutorial tutorial, Long id);

    public void deleteAll();

    public void deleteById(Long id);
}
