package br.dh.meli.HQL.contoller;

import br.dh.meli.HQL.model.Actors;
import br.dh.meli.HQL.model.Movies;
import br.dh.meli.HQL.service.MoviesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.List;

@RestController
@RequestMapping("/movie")
public class MovieController {
    @Autowired
    private MoviesService service;

    @GetMapping("/{title}")
    public ResponseEntity<Movies> findByRating(@PathVariable String title){
        Movies movie= service.getMovieByTitle(title);
        return new ResponseEntity<>(movie, HttpStatus.OK);
    }

    @GetMapping("/actor/{rating}")
    public ResponseEntity<List<Movies>> findByRating(@PathVariable BigDecimal rating){
        List<Movies> moviesList= service.getMoviesByRatingActor(rating);
        return new ResponseEntity<>(moviesList, HttpStatus.OK);
    }

    @GetMapping("/generomovies/{genero}")
    public ResponseEntity<List<Movies>> getMoviesByGenero(@PathVariable String genero){
        List<Movies> moviesList= service.getMoviesByGenero(genero);
        System.out.println(moviesList);
        return new ResponseEntity<>(moviesList, HttpStatus.OK);
    }

}
