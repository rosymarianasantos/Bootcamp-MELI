package br.dh.meli.HQL.repository;

import br.dh.meli.HQL.model.Genres;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GenresRepo extends JpaRepository<Genres, Long> {
}
