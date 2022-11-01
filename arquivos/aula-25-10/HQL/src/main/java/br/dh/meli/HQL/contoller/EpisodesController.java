package br.dh.meli.HQL.contoller;

import br.dh.meli.HQL.model.Episodes;
import br.dh.meli.HQL.service.EpisodesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/episodes")
public class EpisodesController {
    @Autowired
    private EpisodesService service;

    @GetMapping("/actors")
    public ResponseEntity<List<Episodes>> findEpisodeByActor(@RequestParam String nome, @RequestParam String sobrenome) {
        List<Episodes> episodesList = service.findEpisodeByActor(nome, sobrenome);
        return new ResponseEntity<>(episodesList, HttpStatus.OK);
    }
}
