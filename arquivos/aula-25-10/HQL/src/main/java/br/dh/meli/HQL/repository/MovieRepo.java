package br.dh.meli.HQL.repository;

import br.dh.meli.HQL.model.Actors;
import br.dh.meli.HQL.model.Movies;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.math.BigDecimal;
import java.util.List;

public interface MovieRepo extends JpaRepository<Movies, Long> {
   Movies findMoviesByTitle(String title);

   @Query(value = " select * FROM movies INNER JOIN actor_movie on movies.id = actor_movie.movie_id"+
           " INNER JOIN actors on actors.id = actor_movie.actor_id"+
           " where actors.rating > :rating", nativeQuery = true)
   List<Movies> getMoviesByRatingActor(BigDecimal rating);

   @Query(value = "select * from movies INNER JOIN genres on genres.id = movies.genre_id" +
           " where genres.name like :genero", nativeQuery = true)
   List<Movies> getMoviesByGenero(String genero);
}
