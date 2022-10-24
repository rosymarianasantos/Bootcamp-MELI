package br.dh.meli.storage02.service;

import br.dh.meli.storage02.model.Subject;

public interface ISubjectService {
    Subject findById(Long id);
}
