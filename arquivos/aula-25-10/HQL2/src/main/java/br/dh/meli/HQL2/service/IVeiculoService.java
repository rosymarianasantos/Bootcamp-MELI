package br.dh.meli.HQL2.service;

import br.dh.meli.HQL2.Repository.VeiculoRepo;
import br.dh.meli.HQL2.dto.PlacaMarcaModeloPerdaVeiculoDTO;
import br.dh.meli.HQL2.dto.PlacaMarcaModeloVeiculoDTO;
import br.dh.meli.HQL2.dto.PlacaVeiculoDTO;
import br.dh.meli.HQL2.dto.PlacaMarcaVeiculoDTO;
import br.dh.meli.HQL2.model.Veiculo;

import java.util.List;

public interface IVeiculoService {
    Veiculo insert(Veiculo veiculo);

    Void delete();
    List<Veiculo> getVeiculoByPlaca();

    List<PlacaMarcaVeiculoDTO> findVeiculoByPlacaAndMarcaOrderByAnoFabri(int ano);

    List<PlacaVeiculoDTO> findVeiculoByRodasEAno();

    List<PlacaMarcaModeloVeiculoDTO> findVeiculoByPerda();

    List<PlacaMarcaModeloPerdaVeiculoDTO> findVeiculoByPerdaMostrandoValor();

    List<Veiculo> getAll();

}
