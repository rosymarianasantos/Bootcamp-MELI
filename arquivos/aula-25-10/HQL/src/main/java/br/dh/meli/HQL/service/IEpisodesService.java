package br.dh.meli.HQL.service;

import br.dh.meli.HQL.model.Episodes;

import java.util.List;

public interface IEpisodesService {
    List<Episodes> findEpisodeByActor(String nome, String sobrenome);
}
