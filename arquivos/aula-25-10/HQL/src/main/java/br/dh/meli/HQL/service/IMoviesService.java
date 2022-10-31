package br.dh.meli.HQL.service;

import br.dh.meli.HQL.model.Actors;
import br.dh.meli.HQL.model.Movies;

import java.math.BigDecimal;
import java.util.List;

public interface IMoviesService {
    List<Movies> getAll();
    Movies findById(Long id);
    Movies getMovieByTitle(String title);

    List<Movies> getMoviesByRatingActor(BigDecimal rating);

    List<Movies> getMoviesByGenero(String genero);
}
