package br.dh.meli.HQL.repository;

import br.dh.meli.HQL.model.Actors;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.math.BigDecimal;
import java.util.List;

public interface ActorRepo extends JpaRepository<Actors, Long> {
    List<Actors> findActorsByFavoriteMovieIdNotNull();
    List<Actors> findActorsByRatingGreaterThan(BigDecimal rating);

    @Query(value = " select * FROM actors INNER JOIN actor_movie on actors.id = actor_movie.actor_id" +
            " INNER JOIN movies on movies.id = actor_movie.movie_id where movies.title = :title", nativeQuery = true)
    List<Actors> getActorsByMovieTitle(String title);
}
