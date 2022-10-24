package br.dh.meli.storage02.service;

import br.dh.meli.storage02.model.Book;

import java.util.List;

public interface IBookService {
    Book findById(long id);

}
