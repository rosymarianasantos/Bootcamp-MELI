package br.dh.meli.HQL.service;

import br.dh.meli.HQL.model.Movies;
import br.dh.meli.HQL.repository.MovieRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@Service
public class MoviesService implements IMoviesService{
    @Autowired
    private MovieRepo repo;
    @Override
    public List<Movies> getAll() {
        return repo.findAll();
    }

    @Override
    public Movies findById(Long id) {
        Optional<Movies> optionalMovies = repo.findById(id);
        return optionalMovies.orElse(null);
    }

    @Override
    public Movies getMovieByTitle(String title) {
        Movies movies = repo.findMoviesByTitle(title);
        return movies;
    }

    @Override
    public List<Movies> getMoviesByRatingActor(BigDecimal rating) {
        List<Movies> movies = repo.getMoviesByRatingActor(rating);
        return movies;
    }

    @Override
    public List<Movies> getMoviesByGenero(String genero) {
        List<Movies> moviesList = repo.getMoviesByGenero(genero);
        System.out.println(moviesList);
        return moviesList;
    }
}
