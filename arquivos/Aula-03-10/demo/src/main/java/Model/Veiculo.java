package Model;

import DTO.VeiculoDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Veiculo {
    private String placa;
    private String modelo;
    private int ano;
    private double valor;

    public Veiculo(VeiculoDTO veiculoDTO) {
    }
}
