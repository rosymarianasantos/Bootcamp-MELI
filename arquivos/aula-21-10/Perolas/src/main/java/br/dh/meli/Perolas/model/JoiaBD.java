package br.dh.meli.Perolas.model;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@Entity //indica que esta classe sera pesistida
@Table(name = "tb_perolas") //nome da tabela
public class JoiaBD {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //gera automaticamente no banco 1,2,3 ...
    private long codigo;

    @Column(name = "material", length = 100, nullable = false)
    private String material;
    @Column(name = "peso", length = 100, nullable = false)
    private double peso;
    @Column(name = "quilates", length = 100, nullable = false)
    private String quilates;

}
