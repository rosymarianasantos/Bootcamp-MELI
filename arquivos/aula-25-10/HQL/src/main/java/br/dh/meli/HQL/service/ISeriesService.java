package br.dh.meli.HQL.service;

import br.dh.meli.HQL.model.Series;

import java.util.List;

public interface ISeriesService {
    List<Series> getSeriesBySeasons(Long number);
}
