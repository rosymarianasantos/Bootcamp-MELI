package br.dh.meli.HQL2.dto;


import br.dh.meli.HQL2.model.Veiculo;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class PlacaVeiculoDTO {

    private String placa;

    public PlacaVeiculoDTO(Veiculo veiculo) {
        this.placa = veiculo.getPlaca();
    }

}
