package br.dh.meli.HQL.contoller;

import br.dh.meli.HQL.model.Series;
import br.dh.meli.HQL.service.SeriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/series")
public class SeriesController {
    @Autowired
    private SeriesService service;

    @GetMapping("/seasons/{number}")
    public ResponseEntity<List<Series>> getSeriesBySeasons(@PathVariable Long number) {
        List<Series> seriesList = service.getSeriesBySeasons(number);
        return new ResponseEntity<>(seriesList, HttpStatus.OK);
    }
}
