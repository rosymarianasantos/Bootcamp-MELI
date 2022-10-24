package br.dh.meli.storage02.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity //pra ser gravado no banco de dados
@Getter
@Setter
@NoArgsConstructor
public class Author {
    @Id //chave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY) //ser gerado automaticamente pelo banco
    private long id;
    @Column(nullable = false) //o nome é obrigatorio
    private String name;

    @OneToOne(mappedBy = "author")
    @JsonIgnoreProperties("author")
    private Address address; //autor relacioando ao endereco
}
