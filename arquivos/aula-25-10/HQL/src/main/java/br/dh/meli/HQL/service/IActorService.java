package br.dh.meli.HQL.service;

import br.dh.meli.HQL.model.Actors;

import java.math.BigDecimal;
import java.util.List;

public interface IActorService {
    List<Actors> getAll();
   // Actors findById(Long id);
    List<Actors> findByMovieFavorite();
    List<Actors> findByRating(BigDecimal rating);

    List<Actors> getActorByMovie(String title);
}
