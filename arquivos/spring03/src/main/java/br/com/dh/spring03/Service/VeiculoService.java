package br.com.dh.spring03.Service;

import br.com.dh.spring03.Model.Veiculo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VeiculoService implements IVeiculo {
    @Override
    public Veiculo getVeiculo(String placa) {
        return new Veiculo(placa, "Astra", 2000, 1200);
    }
    @Override
    public List<Veiculo> getAllVeiculo() {
        return null;
    }
}
