package br.dh.meli.HQL2.Repository;

import br.dh.meli.HQL2.dto.PlacaMarcaModeloPerdaVeiculoDTO;
import br.dh.meli.HQL2.dto.PlacaMarcaModeloVeiculoDTO;
import br.dh.meli.HQL2.dto.PlacaVeiculoDTO;
import br.dh.meli.HQL2.dto.PlacaMarcaVeiculoDTO;
import br.dh.meli.HQL2.model.Veiculo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface VeiculoRepo extends JpaRepository<Veiculo, Long> {
    List<Veiculo> findVeiculoByPlacaNotNull();

    @Query( "select v from Veiculo v" +
            " where v.anoFabri = :ano")
    List<PlacaMarcaVeiculoDTO> findVeiculoByPlacaAndMarcaOrderByAnoFabri(int ano);

    @Query( "select v from Veiculo v" +
            " where v.numRodas > 4 and v.anoFabri = 2022")
    List<PlacaVeiculoDTO> findVeiculoByRodasEAno();

    @Query( "select v from Veiculo v" +
            " inner join Sinistro s" +
            " on s.veiculoId = v.id" +
            " where s.perda > 10000")
    List<PlacaMarcaModeloVeiculoDTO> findVeiculoByPerda();

    @Query("select v from Veiculo v" +
            " inner join Sinistro s" +
            " on s.veiculoId = v.id" +
            " where s.perda > 10000")
    List<PlacaMarcaModeloPerdaVeiculoDTO> findVeiculoByPerdaMostrandoValor();
}
