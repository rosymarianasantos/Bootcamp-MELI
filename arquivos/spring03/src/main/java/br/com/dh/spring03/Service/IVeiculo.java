package br.com.dh.spring03.Service;

import br.com.dh.spring03.Model.Veiculo;
import java.util.List;

public interface IVeiculo {
        Veiculo getVeiculo(String placa);
        List<Veiculo> getAllVeiculo();
}
