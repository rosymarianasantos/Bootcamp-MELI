package br.dh.meli.storage01.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
@Getter
@Setter
@NoArgsConstructor
@Entity //indica que esta classe sera pesistida no BD
@Table(name = "tb_user") //nome dado a tabela do BD (OPCIONAL)
public class UserBD {

    @Id //indica que  o campo é PK
    @GeneratedValue(strategy = GenerationType.IDENTITY) //gera automatico no banco 1,2,3 ....
    private long identificacao;

    @Column(length = 150, nullable = false) //compo com tamanho de 150 e nao pode ser nulo
    private String name;
    @Column(name = "e_mail", length = 100, unique = true) //tamanho maximo de 100 caracteres e o campo tem q ser unico nao pode ter dois emails
    private String email;
}
