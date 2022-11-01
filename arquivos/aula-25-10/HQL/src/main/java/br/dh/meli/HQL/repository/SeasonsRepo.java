package br.dh.meli.HQL.repository;

import br.dh.meli.HQL.model.Seasons;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SeasonsRepo extends JpaRepository<Seasons, Long> {
}
