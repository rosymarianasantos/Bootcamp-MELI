package br.dh.meli.storage02.service;

import br.dh.meli.storage02.model.Book;
import br.dh.meli.storage02.repository.BookRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class BookService implements IBookService{

    private final BookRepo repo;

    @Override
    public Book findById(long id) {
        Optional<Book> optionalBook = repo.findById(id);
        if(optionalBook.isPresent()){
            return optionalBook.get();
        }
        return null;

       // Book book = repo.findById(id).orElse(null); ou return repo.findById(id).orElse(null)
        // faz o mesmo que feito em cima so que com uma unica linha
    }
}
