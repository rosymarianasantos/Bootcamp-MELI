package br.dh.meli.storage01.controller;

import br.dh.meli.storage01.model.UserBD;
import br.dh.meli.storage01.service.UserService;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService service;

    @PostMapping
    public ResponseEntity<UserBD> novoUser(@RequestBody UserBD userDB){
        UserBD newUser = service.inserir(userDB);

        return new ResponseEntity<>(newUser, HttpStatus.CREATED);
    }

    @GetMapping("/{cod}")
    public ResponseEntity<UserBD> findUser(@PathVariable long cod) {
        Optional<UserBD> optionalUserBD = service.find(cod);

        if(optionalUserBD.isPresent()) {
            return new ResponseEntity<>(optionalUserBD.get(), HttpStatus.OK);
        }
        return  new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
    @PutMapping
    public ResponseEntity<UserBD> update(@RequestBody UserBD userBD) {
        UserBD userUpdate = service.update(userBD);
        return new ResponseEntity<>(userUpdate, HttpStatus.OK);
    }
    @DeleteMapping("/{cod}")
    public ResponseEntity<Void> delete(@PathVariable long cod) {
        service.delete(cod);

        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
