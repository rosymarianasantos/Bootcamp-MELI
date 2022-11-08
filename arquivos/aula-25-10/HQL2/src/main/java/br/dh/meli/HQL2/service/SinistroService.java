package br.dh.meli.HQL2.service;

import br.dh.meli.HQL2.Repository.SinistroRepo;
import br.dh.meli.HQL2.model.Sinistro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SinistroService implements ISinistroService{
    @Autowired
    private SinistroRepo repo;
    @Override
    public Sinistro insert(Sinistro sinistro) {
        Sinistro newSinistro = repo.save(sinistro);
        return newSinistro;
    }

    @Override
    public Void delete() {
        repo.deleteAll();
        return null;
    }
}
