package br.dh.meli.HQL2.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "veiculo")
public class Veiculo {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "placa")
    private String placa;

    @Column(name = "marca")
    private String marca;

    @Column(name = "modelo")
    private String modelo;

    @Column(name = "anoFabri")
    private int anoFabri;

    @Column(name = "numRodas")
    private int numRodas;

    @OneToMany(mappedBy = "veiculo", fetch = FetchType.LAZY)
    @JsonIgnoreProperties("veiculo")
    private List<Sinistro> sinistroList;

}
