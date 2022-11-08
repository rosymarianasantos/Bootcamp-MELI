package br.dh.meli.HQL2.dto;


import br.dh.meli.HQL2.model.Sinistro;
import br.dh.meli.HQL2.model.Veiculo;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.query.criteria.internal.expression.function.AggregationFunction;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PlacaMarcaModeloPerdaVeiculoDTO {
    private String placa;
    private String marca;
    private String modelo;

    private Map<BigDecimal, Sinistro> perdas;
    //private BigDecimal perda;

    public PlacaMarcaModeloPerdaVeiculoDTO(Veiculo veiculo) {
        this.placa = veiculo.getPlaca();
        this.marca = veiculo.getMarca();
        this.modelo = veiculo.getModelo();
        //this.perdas = veiculo.getSinistroList().stream().collect(Collectors.groupingBy(Sinistro::getPerda), Collectors.reducing(BigDecimal.ZERO, getPerdas(), BigDecimal::add));
        //this.perda = sinistro.stream().map(Sinistro::getPerda).reduce(BigDecimal.ZERO, BigDecimal::add);
       // this.perda = sinistro.getPerda();
    }
}
