package br.dh.meli.HQL.contoller;

import br.dh.meli.HQL.model.Actors;
import br.dh.meli.HQL.service.ActorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.swing.plaf.PanelUI;
import java.math.BigDecimal;
import java.util.List;

@RestController
@RequestMapping("/actor")
public class ActorController {
    @Autowired
    private ActorService service;

    @GetMapping
    public ResponseEntity<List<Actors>> getAll() {
        List<Actors> actorsList = service.getAll();
        return new ResponseEntity<>(actorsList, HttpStatus.OK);
    }

    @GetMapping("/favorite-movie")
    public ResponseEntity<List<Actors>> findByFavorite() {
        List<Actors> actorsList = service.findByMovieFavorite();
        return new ResponseEntity<>(actorsList, HttpStatus.OK);
    }

    @GetMapping("/rating/{rating}")
    public ResponseEntity<List<Actors>> findByRating(@PathVariable BigDecimal rating){
        List<Actors> actorsList = service.findByRating(rating);
        return new ResponseEntity<>(actorsList, HttpStatus.OK);
    }

    @GetMapping("/{title}")
    public ResponseEntity<List<Actors>> findActorByMovie(@PathVariable String title) {
        List<Actors> actorsList = service.getActorByMovie(title);
        return new ResponseEntity<>(actorsList, HttpStatus.OK);
    }

}
