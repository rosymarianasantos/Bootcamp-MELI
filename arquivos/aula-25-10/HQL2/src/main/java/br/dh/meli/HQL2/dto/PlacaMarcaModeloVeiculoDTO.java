package br.dh.meli.HQL2.dto;


import br.dh.meli.HQL2.model.Veiculo;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class PlacaMarcaModeloVeiculoDTO {
    private String placa;
    private String marca;
    private String modelo;

    public PlacaMarcaModeloVeiculoDTO(Veiculo veiculo) {
        this.placa = veiculo.getPlaca();
        this.marca = veiculo.getMarca();
        this.modelo = veiculo.getModelo();
    }
}
