package br.dh.meli.storage02.service;

import br.dh.meli.storage02.model.Subject;
import br.dh.meli.storage02.repository.SubjctRepo;

public class SujectService extends ISubjectService{

    private final SubjctRepo repo;

    @Override
    public Subject findById(Long id) {
        return repo.findById(id);
    }
}
