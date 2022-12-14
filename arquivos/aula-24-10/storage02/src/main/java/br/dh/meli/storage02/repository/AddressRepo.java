package br.dh.meli.storage02.repository;

import br.dh.meli.storage02.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;
//JpaRepository nos permite trabalhar com ordenacao e paginacao, diferente do CRUD
public interface AddressRepo extends JpaRepository<Address, Long> {
}
