package br.dh.meli.HQL2.service;

import br.dh.meli.HQL2.Repository.VeiculoRepo;
import br.dh.meli.HQL2.dto.PlacaMarcaModeloVeiculoDTO;
import br.dh.meli.HQL2.dto.PlacaMarcaVeiculoDTO;
import br.dh.meli.HQL2.dto.PlacaVeiculoDTO;
import br.dh.meli.HQL2.model.Sinistro;
import br.dh.meli.HQL2.model.Veiculo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.*;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.stubbing.OngoingStubbing;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.ArrayList;
import java.util.List;

@ExtendWith(MockitoExtension.class)
public class VeiculoServiceTest {
    @InjectMocks
    private VeiculoService service;

    @Mock
    private VeiculoRepo repo;
    private Veiculo veiculo;
    private Veiculo veiculo2;
    private Veiculo veiculo3;
    private PlacaVeiculoDTO placaVeiculoDTO;
    private PlacaMarcaVeiculoDTO placaMarcaVeiculoDTO;
    private PlacaMarcaModeloVeiculoDTO placaMarcaModeloVeiculoDTO;
    private Sinistro sinistro;

    List<Veiculo> veiculoList = new ArrayList<>();
    List<Sinistro> sinistroList = new ArrayList<>();

    @BeforeEach
    void setup() {
        veiculo = new Veiculo(1L,"PZ47", "Palio", "Plus", 2022, 4, sinistroList);
        veiculo2 = new Veiculo(1L,"PZ47", "Palio", "Plus", 2022, 4, sinistroList);
        veiculo3 = new Veiculo(2L,"PZ48", "Palio", "Onibus", 2022, 6, sinistroList);
    }

    @Test
    @DisplayName("Testando metodo insert")
    void insertVeiculo_returnVeiculo_whenSucess(){
        //cenario
       //veiculo = new Veiculo(1L,"PZ47", "Palio", "Plus", 2022, 4, sinistroList);

        //acao
        Mockito.when(repo.save(veiculo)).thenReturn(veiculo);
        Veiculo veiculoTeste = service.insert(veiculo);

        //verificacao
        assertThat(veiculoTeste).isNotNull();
        assertThat(veiculoTeste.getPlaca()).isEqualTo(veiculo.getPlaca());
        assertThat(veiculoTeste.getMarca()).isEqualTo(veiculo.getMarca());
        assertThat(veiculoTeste.getModelo()).isEqualTo(veiculo.getModelo());
        assertThat(veiculoTeste.getNumRodas()).isEqualTo(veiculo.getNumRodas());
        assertThat(veiculoTeste.getNumRodas()).isPositive();
        assertThat(veiculoTeste.getAnoFabri()).isEqualTo(veiculo.getAnoFabri());
        assertThat(veiculoTeste.getAnoFabri()).isPositive();
    }

    @Test
    @DisplayName("Testando metodo getVeiculoByPlaca")
    void getVeiculoByPlacaVeiculo_returnPlaca_whenSucess() {
        //cenario
        veiculoList.add(veiculo);
        veiculoList.add(veiculo2);
        veiculoList.add(veiculo3);

        //acao
            Mockito.when(repo.findVeiculoByPlacaNotNull()).thenReturn(veiculoList);
            List<Veiculo> veiculoListTeste = service.getVeiculoByPlaca();
            placaVeiculoDTO = new PlacaVeiculoDTO(veiculo);

        // verificacao
            assertThat(veiculoListTeste).isNotEmpty();
            assertThat(veiculo.getPlaca()).isEqualTo(placaVeiculoDTO.getPlaca());
            assertThat(veiculoListTeste.size()).isEqualTo(veiculoList.size());
            assertThat(veiculoListTeste).isEqualTo(veiculoList);
    }

    @Test
    @DisplayName("Testando metodo findVeiculoByPlacaAndMarcaOrderByAnoFabri")
    void findVeiculoByPlacaAndMarcaOrderByAnoFabriVeiculoByPlacaVeiculo_returnPlacaEMarca_whenSucess() {
        //canario
        int ano = 2022;
        //acao
        placaMarcaVeiculoDTO = new PlacaMarcaVeiculoDTO(veiculo);
        List<PlacaMarcaVeiculoDTO> list = new ArrayList<>();
        list.add(new PlacaMarcaVeiculoDTO(veiculo));
        list.add(new PlacaMarcaVeiculoDTO(veiculo2));
        list.add(new PlacaMarcaVeiculoDTO(veiculo3));
        Mockito.when(repo.findVeiculoByPlacaAndMarcaOrderByAnoFabri(ano)).thenReturn(list);
        List<PlacaMarcaVeiculoDTO> veiculoListTeste = service.findVeiculoByPlacaAndMarcaOrderByAnoFabri(ano);
        placaMarcaVeiculoDTO = new PlacaMarcaVeiculoDTO(veiculo);

        // verificacao
        assertThat(veiculoListTeste).isNotEmpty();
        assertThat(veiculo.getPlaca()).isEqualTo(placaMarcaVeiculoDTO.getPlaca());
        assertThat(veiculo.getMarca()).isEqualTo(placaMarcaVeiculoDTO.getMarca());
        assertThat(veiculoListTeste.size()).isEqualTo(list.size());
        assertThat(veiculoListTeste).isEqualTo(list);
    }

    @Test
    @DisplayName("Testando metodo findVeiculoByRodasEAno")
    void findVeiculoByRodasEAno_returnPlaca_whenSucess() {
        //canario
        int ano = 2022;
        //acao
        placaVeiculoDTO = new PlacaVeiculoDTO(veiculo);
        List<PlacaVeiculoDTO> list = new ArrayList<>();
        list.add(new PlacaVeiculoDTO(veiculo));
        list.add(new PlacaVeiculoDTO(veiculo2));
        list.add(new PlacaVeiculoDTO(veiculo3));
        Mockito.when(repo.findVeiculoByRodasEAno()).thenReturn(list);
        List<PlacaVeiculoDTO> veiculoListTeste = service.findVeiculoByRodasEAno();
        placaVeiculoDTO = new PlacaVeiculoDTO(veiculo);

        // verificacao
        assertThat(veiculoListTeste).isNotEmpty();
        assertThat(veiculo.getPlaca()).isEqualTo(placaVeiculoDTO.getPlaca());
        assertThat(veiculoListTeste.size()).isEqualTo(list.size());
        assertThat(veiculoListTeste).isEqualTo(list);
    }

    @Test
    @DisplayName("Testando metodo findVeiculoByPerda")
    void findVeiculoByPerda_returnPlacaMarcaModelo_whenSucess() {
        //canario
        int ano = 2022;
        //acao
        placaMarcaModeloVeiculoDTO = new PlacaMarcaModeloVeiculoDTO(veiculo);
        List<PlacaMarcaModeloVeiculoDTO> list = new ArrayList<>();
        list.add(new PlacaMarcaModeloVeiculoDTO(veiculo));
        list.add(new PlacaMarcaModeloVeiculoDTO(veiculo2));
        list.add(new PlacaMarcaModeloVeiculoDTO(veiculo3));
        Mockito.when(repo.findVeiculoByPerda()).thenReturn(list);
        List<PlacaMarcaModeloVeiculoDTO> veiculoListTeste = service.findVeiculoByPerda();
        placaMarcaModeloVeiculoDTO = new PlacaMarcaModeloVeiculoDTO(veiculo);

        // verificacao
        assertThat(veiculoListTeste).isNotEmpty();
        assertThat(veiculo.getPlaca()).isEqualTo(placaMarcaModeloVeiculoDTO.getPlaca());
        assertThat(veiculo.getMarca()).isEqualTo(placaMarcaModeloVeiculoDTO.getMarca());
        assertThat(veiculo.getModelo()).isEqualTo(placaMarcaModeloVeiculoDTO.getModelo());
        assertThat(veiculoListTeste.size()).isEqualTo(list.size());
        assertThat(veiculoListTeste).isEqualTo(list);
    }

    @Test
    @DisplayName("Testando metodo getAll")
    void getAll_returnVeiculos_whenSucess() {
        //cenario
//        List<Veiculo> veiculoList = repo.findAll();
//        return veiculoList;
        veiculoList.add(veiculo);
        veiculoList.add(veiculo2);
        veiculoList.add(veiculo3);

        //acao
        Mockito.when(repo.findAll()).thenReturn(veiculoList);
        List<Veiculo> veiculoListTeste = service.getAll();

        // verificacao
        assertThat(veiculoListTeste).isNotEmpty();
        assertThat(veiculoListTeste.size()).isEqualTo(veiculoList.size());
        assertThat(veiculoListTeste).isEqualTo(veiculoList);
    }

    @Test
    @DisplayName("Testando metodo delete")
    void delete_returnNull_WhenSucess() {

        assertThat(service.delete()).isNull();
    }

}
