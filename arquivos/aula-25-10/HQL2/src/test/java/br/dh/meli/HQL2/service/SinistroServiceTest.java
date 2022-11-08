package br.dh.meli.HQL2.service;


import br.dh.meli.HQL2.Repository.SinistroRepo;
import br.dh.meli.HQL2.model.Sinistro;
import br.dh.meli.HQL2.model.Veiculo;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.BDDMockito;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(MockitoExtension.class)
public class SinistroServiceTest {

    @InjectMocks
    SinistroService service;

    @Mock
    SinistroRepo repo;

    private Sinistro sinistro;
    private Veiculo veiculo;



    @Test
    @DisplayName("Testando metodo insert")
    void insertVeiculo_returnVeiculo_whenSucess(){
        //cenario
        Date data = new Date(2022, 05, 05);
        List<Sinistro> sinistroList = new ArrayList<>();
        veiculo = new Veiculo(1L,"PZ47", "Palio", "Plus", 2022, 4, sinistroList);
        sinistro = new Sinistro(1L, data, BigDecimal.valueOf(39000.0), 1L, veiculo);

        //acao

        Mockito.when(repo.save(sinistro)).thenReturn(sinistro);
        Sinistro sinistroTeste = service.insert(sinistro);

        //verificacao
        assertThat(sinistroTeste).isNotNull();
        assertThat(sinistroTeste.getVeiculoId()).isEqualTo(sinistro.getVeiculoId());
        assertThat(sinistroTeste.getData()).isEqualTo(sinistro.getData());
        assertThat(sinistroTeste.getPerda()).isEqualTo(sinistro.getPerda());
        assertThat(sinistroTeste.getVeiculo()).isEqualTo(sinistro.getVeiculo());
        assertThat(sinistroTeste.getPerda()).isPositive();
    }

    @Test
    @DisplayName("Testando metodo delete")
    void delete_returnNull_WhenSucess() {
        assertThat(service.delete()).isNull();
    }
}
