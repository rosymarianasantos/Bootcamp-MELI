package br.dh.meli.storage01.repository;

import br.dh.meli.storage01.model.UserBD;
import org.springframework.data.repository.CrudRepository;

// CRUD - CREATE, READ, UPDATE, DELETE
public interface IUserRepo extends CrudRepository<UserBD, Long> {

}
