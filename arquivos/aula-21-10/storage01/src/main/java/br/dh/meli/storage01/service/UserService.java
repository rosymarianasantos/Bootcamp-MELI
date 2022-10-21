package br.dh.meli.storage01.service;

import br.dh.meli.storage01.model.UserBD;
import br.dh.meli.storage01.repository.IUserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private IUserRepo repo;

    public UserBD inserir(UserBD userBD) {
        UserBD newUser = repo.save(userBD);
        return newUser;
    }

    public Optional<UserBD> find(long cod) {
        return repo.findById(cod);
    }

    public UserBD update(UserBD userBD) {
        return repo.save(userBD);
    }

    public void delete(long cod) {
        repo.deleteById(cod);
    }

}
