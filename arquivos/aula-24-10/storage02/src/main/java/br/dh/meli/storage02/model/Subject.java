package br.dh.meli.storage02.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.List;

public class Subject {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(nullable = false)
    private String name;

    @OneToMany(mappedBy = "subject")
    @JsonIgnoreProperties("subject")
    private List<Book> books;
}
