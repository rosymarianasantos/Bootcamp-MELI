package br.dh.meli.HQL.service;

import br.dh.meli.HQL.model.Episodes;
import br.dh.meli.HQL.repository.EpisodesRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EpisodesService implements IEpisodesService {
    @Autowired
    private EpisodesRepo repo;

    @Override
    public List<Episodes> findEpisodeByActor(String nome, String sobrenome) {
        List<Episodes> episodesList = repo.findEpisodeByActor(nome, sobrenome);
        return episodesList;
    }
}
