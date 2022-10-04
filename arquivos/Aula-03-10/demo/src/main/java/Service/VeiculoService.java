package Service;

import DTO.VeiculoDTO;
import Model.Veiculo;
import Repository.VeiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class VeiculoService implements IVeiculo{
    @Autowired
    private VeiculoRepository repos;


    @Override
    public Veiculo getVeiculo(String placa) throws ClassNotFoundException {
        Optional<Veiculo> veiculo = repos.getVeiculo(placa);
        if(veiculo.isEmpty()) {
            throw new ClassNotFoundException("Deu ruim no getVeiculo Service");
        }
        return veiculo.get();
    }

    @Override
    public List<Veiculo> getAllVeiculo() {
        return repos.getAll().stream().map(v -> new VeiculoDTO(v)).map(Veiculo::new).collect(Collectors.toList());
    }

    @Override
    public List<Veiculo> getAllOrderByValue() {
        List<Veiculo> veiculos = repos.getAll();

         return veiculos.stream().sorted().collect(Collectors.toList());
    }

    @Override
    public void save(Veiculo veiculo) {
        repos.saveVeiculo(veiculo);

    }

    @Override
    public List<Veiculo> getByModel(String model) {
        return getAllOrderByValue().stream().filter(veiculo -> veiculo.getModelo().equalsIgnoreCase(model)).collect(Collectors.toList());
    }
}
