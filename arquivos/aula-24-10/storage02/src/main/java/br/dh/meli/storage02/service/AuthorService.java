package br.dh.meli.storage02.service;

import br.dh.meli.storage02.model.Author;
import br.dh.meli.storage02.repository.AuthorRepo;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
//@RequiredArgsConstrutor -> pra usar lombok
public class AuthorService implements IAuthorService {

    private AuthorRepo repo;
    //private final AuthorRepo repo; pra usar o lombok
    public AuthorService(AuthorRepo authorRepo) { //tiraria isso no lombok
        repo = authorRepo;
    }

    @Override
    public Author insert(Author author) {
        return repo.save(author);
    }

    @Override
    public Author findById(long id) {
        Optional<Author> optionalAuthor = repo.findById(id);
        if(optionalAuthor.isPresent()) {
            return optionalAuthor.get();
        }
        return null;
    }
}
