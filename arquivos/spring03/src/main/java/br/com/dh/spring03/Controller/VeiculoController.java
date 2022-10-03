package br.com.dh.spring03.Controller;


import br.com.dh.spring03.Model.Veiculo;
import br.com.dh.spring03.Service.VeiculoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Provider;

@RestController
@RequestMapping("/veiculos")
public class VeiculoController {
    @Autowired  //injecao de dependencia (o framework gera o objeto)
   // public VeiculoService service = new VeiculoService(); o autowired faz exatamente isso
    private VeiculoService service;

    @GetMapping("/{placa}")
    public ResponseEntity<Veiculo> getVeiculo(@PathVariable String placa) {
        Veiculo veiculo = service.getVeiculo(placa);

        return new ResponseEntity<>(veiculo, HttpStatus.OK);
    }
}
