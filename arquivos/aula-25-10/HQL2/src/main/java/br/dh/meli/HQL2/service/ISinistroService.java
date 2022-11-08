package br.dh.meli.HQL2.service;

import br.dh.meli.HQL2.model.Sinistro;

public interface ISinistroService {
    Sinistro insert(Sinistro sinistro);

    Void delete();
}
