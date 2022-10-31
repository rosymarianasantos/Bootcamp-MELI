package br.dh.meli.HQL.service;

import br.dh.meli.HQL.model.Actors;
import br.dh.meli.HQL.repository.ActorRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class ActorService implements IActorService{
    @Autowired
    private ActorRepo repo;
    @Override
    public List<Actors> getAll() {
        List<Actors> actors = repo.findAll();
        return actors;
    }

//    @Override
//    public Actors findById(Long id) {
//        Optional<Actors> optionalActors = repo.findById(id);
//        return optionalActors.orElse(null);
//    }

    @Override
    public List<Actors> findByMovieFavorite() {
        List <Actors> actorsList = repo.findActorsByFavoriteMovieIdNotNull();
        return actorsList;
    }

    @Override
    public List<Actors> findByRating(BigDecimal rating) {
        List<Actors> actorsList = repo.findActorsByRatingGreaterThan(rating);
        return actorsList;
    }

    @Override
    public List<Actors> getActorByMovie(String title) {
        List<Actors> actorsList = repo.getActorsByMovieTitle(title);
        return actorsList;
    }
}
