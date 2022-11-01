package br.dh.meli.HQL.repository;

import br.dh.meli.HQL.model.Series;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface SeriesRepo extends JpaRepository<Series, Long> {
    @Query(value = "select distinct series.id, series.created_at, series.updated_at, series.title, series.release_date, series.end_date, series.genre_id" +
            " from series inner join seasons" +
            " on seasons.serie_id = series.id"+
            " where seasons.number > :number", nativeQuery = true)
    List<Series> getSeriesBySeasons(Long number);
}
