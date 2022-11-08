package br.dh.meli.HQL2.service;

import br.dh.meli.HQL2.Repository.VeiculoRepo;
import br.dh.meli.HQL2.dto.PlacaMarcaModeloPerdaVeiculoDTO;
import br.dh.meli.HQL2.dto.PlacaMarcaModeloVeiculoDTO;
import br.dh.meli.HQL2.dto.PlacaVeiculoDTO;
import br.dh.meli.HQL2.dto.PlacaMarcaVeiculoDTO;
import br.dh.meli.HQL2.model.Veiculo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VeiculoService implements IVeiculoService {
    @Autowired
    private VeiculoRepo repo;

    @Override
    public Veiculo insert(Veiculo veiculo) {
        return repo.save(veiculo);
    }

    @Override
    public Void delete() {
        repo.deleteAll();
        return null;
    }

    @Override
    public List<Veiculo> getVeiculoByPlaca() {
        List<Veiculo> veiculoList = repo.findVeiculoByPlacaNotNull();
        return veiculoList;
    }

    @Override
    public List<PlacaMarcaVeiculoDTO> findVeiculoByPlacaAndMarcaOrderByAnoFabri(int ano) {
        List<PlacaMarcaVeiculoDTO> veiculoList = repo.findVeiculoByPlacaAndMarcaOrderByAnoFabri(ano);
        return veiculoList;
    }

    @Override
    public List<PlacaVeiculoDTO> findVeiculoByRodasEAno() {
        List<PlacaVeiculoDTO> veiculoDTOList = repo.findVeiculoByRodasEAno();
        return veiculoDTOList;
    }

    @Override
    public List<PlacaMarcaModeloVeiculoDTO> findVeiculoByPerda() {
        List<PlacaMarcaModeloVeiculoDTO> veiculoDTOList = repo.findVeiculoByPerda();
        return veiculoDTOList;
    }

    @Override
    public List<PlacaMarcaModeloPerdaVeiculoDTO> findVeiculoByPerdaMostrandoValor() {
        List<PlacaMarcaModeloPerdaVeiculoDTO> veiculoDTOList = repo.findVeiculoByPerdaMostrandoValor();
        return veiculoDTOList;
    }

    @Override
    public List<Veiculo> getAll() {
        List<Veiculo> veiculoList = repo.findAll();
        return veiculoList;
    }
}
