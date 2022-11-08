package br.dh.meli.HQL2.Repository;

import br.dh.meli.HQL2.model.Sinistro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SinistroRepo extends JpaRepository<Sinistro, Long> {
}
