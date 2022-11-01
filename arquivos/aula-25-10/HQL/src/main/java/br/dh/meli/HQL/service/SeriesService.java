package br.dh.meli.HQL.service;

import br.dh.meli.HQL.model.Series;
import br.dh.meli.HQL.repository.SeriesRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SeriesService implements ISeriesService{
    @Autowired
    private SeriesRepo repo;

    @Override
    public List<Series> getSeriesBySeasons(Long number) {
        List<Series> seriesList = repo.getSeriesBySeasons(number);
        return seriesList;
    }
}
