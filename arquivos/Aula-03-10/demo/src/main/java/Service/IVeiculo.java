package Service;

import Model.Veiculo;

import java.util.List;

public interface IVeiculo {
    Veiculo getVeiculo(String placa) throws ClassNotFoundException;
    List<Veiculo> getAllVeiculo();
    List<Veiculo> getAllOrderByValue();
    void save(Veiculo veiculo);
    List<Veiculo> getByModel(String model);
}
