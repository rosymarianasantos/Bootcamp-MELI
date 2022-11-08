package br.dh.meli.HQL2.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "sinistro")
public class Sinistro {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "data")
    private Date data;

    @Column(name = "perda")
    private BigDecimal perda;

    @Column(name = "veiculoId")
    private Long veiculoId;

    @ManyToOne
    @JoinColumn(name = "veiculoId", insertable = false, updatable = false)
    @JsonIgnoreProperties("sinistro")
    private Veiculo veiculo;
}
