package br.dh.meli.HQL2.controller;


import br.dh.meli.HQL2.dto.PlacaMarcaModeloPerdaVeiculoDTO;
import br.dh.meli.HQL2.dto.PlacaMarcaModeloVeiculoDTO;
import br.dh.meli.HQL2.dto.PlacaVeiculoDTO;
import br.dh.meli.HQL2.dto.PlacaMarcaVeiculoDTO;
import br.dh.meli.HQL2.model.Veiculo;
import br.dh.meli.HQL2.service.VeiculoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/veiculo")
public class VeiculoController {
    @Autowired
    private VeiculoService service;

    @PostMapping
    ResponseEntity<Veiculo> Insert(@RequestBody Veiculo veiculo) {
        Veiculo newVeiculo = service.insert(veiculo);
        return new ResponseEntity<>(newVeiculo, HttpStatus.CREATED);
    }

    @GetMapping
    ResponseEntity<List<Veiculo>> getAll(){
        List<Veiculo> veiculoList = service.getAll();
        return new ResponseEntity<>(veiculoList, HttpStatus.OK);
    }

    @GetMapping("/placa")
    public ResponseEntity<List<Veiculo>> getVeiculoByPlaca() {
        List<Veiculo> veiculoList = service.getVeiculoByPlaca();
        return new ResponseEntity<>(veiculoList, HttpStatus.OK);
    }

    @GetMapping("/ano/{ano}")
    public ResponseEntity<List<PlacaMarcaVeiculoDTO>> getVeiculoByAno(@PathVariable int ano) {
        List<PlacaMarcaVeiculoDTO> veiculoList = service.findVeiculoByPlacaAndMarcaOrderByAnoFabri(ano);
        return new ResponseEntity<>(veiculoList, HttpStatus.OK);
    }

    @GetMapping("/marca/ano")
    public ResponseEntity<List<PlacaVeiculoDTO>> getVeiculoByRodasAno(){
        List<PlacaVeiculoDTO> veiculoDTOList = service.findVeiculoByRodasEAno();
        return new ResponseEntity<>(veiculoDTOList, HttpStatus.OK);
    }

    @GetMapping("/perda")
    public ResponseEntity<List<PlacaMarcaModeloVeiculoDTO>> getVeiculoByPerda() {
        List<PlacaMarcaModeloVeiculoDTO> veiculoDTOList = service.findVeiculoByPerda();
        return new ResponseEntity<>(veiculoDTOList, HttpStatus.OK);
    }

    @GetMapping("/valor")
    public ResponseEntity<List<PlacaMarcaModeloPerdaVeiculoDTO>> getVeiculoByValor() {
        List<PlacaMarcaModeloPerdaVeiculoDTO> veiculoDTOList = service.findVeiculoByPerdaMostrandoValor();
        return new ResponseEntity<>(veiculoDTOList, HttpStatus.OK);
    }

    @DeleteMapping
    ResponseEntity<Void> Delete() {
        service.delete();
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
