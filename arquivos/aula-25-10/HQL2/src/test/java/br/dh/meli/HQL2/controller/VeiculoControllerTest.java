package br.dh.meli.HQL2.controller;

import br.dh.meli.HQL2.model.Sinistro;
import br.dh.meli.HQL2.model.Veiculo;
import br.dh.meli.HQL2.service.VeiculoService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.BDDMockito;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.web.bind.annotation.RequestBody;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


import java.util.ArrayList;
import java.util.List;

@WebMvcTest(VeiculoController.class)
public class VeiculoControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

    VeiculoController controller;

    @MockBean
    VeiculoService service;

    private Veiculo veiculo1;
    private Veiculo veiculo2;
    private Veiculo veiculo3;

    List<Veiculo> veiculoList = new ArrayList<>();
    List<Sinistro> sinistroList = new ArrayList<>();

    @BeforeEach
    void setup() {
        veiculo1 = new Veiculo(1L,"PZ47", "Palio", "Plus", 2022, 4, sinistroList);
        veiculo2 = new Veiculo(1L,"PZ47", "Palio", "Plus", 2022, 4, sinistroList);
        veiculo3 = new Veiculo(2L,"PZ48", "Palio", "Onibus", 2022, 6, sinistroList);
    }


    @Test
    @DisplayName("Testando metodo insert")
    void postVeiculo_WhenVeiculoIsValid_ThenReturnVeiculo() throws Exception {
        BDDMockito.when(service.insert(veiculo1)).thenReturn(veiculo1);

        ResultActions resposta = mockMvc.perform(
              post("/veiculo"), veiculo1);

        System.out.printf("TESTE ", resposta);

        resposta.andExpect(status().isCreated());

    }


    // post ("/veiculo")
//    ResponseEntity<Veiculo> Insert(@RequestBody Veiculo veiculo) {
//        Veiculo newVeiculo = service.insert(veiculo);
//        return new ResponseEntity<>(newVeiculo, HttpStatus.OK);
//    }
}
