package Controller;

import DTO.VeiculoDTO;
import Model.Veiculo;
import Service.IVeiculo;
import Service.VeiculoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/veiculos")
public class VeiculoController {
    @Autowired
    private IVeiculo service;

    @GetMapping("/{placa}")
    public ResponseEntity<Veiculo> getVeiculo(@PathVariable String placa) throws ClassNotFoundException {
        Veiculo veiculo = service.getVeiculo(placa);
        return new ResponseEntity<>(veiculo, HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<Veiculo>> getll() {
        return new ResponseEntity<>(service.getAllVeiculo(), HttpStatus.OK);
    }

    @GetMapping("/byvalue")
    public ResponseEntity<List<Veiculo>> getAllByValue() {
        return new ResponseEntity<>(service.getAllOrderByValue(), HttpStatus.OK);
    }

    @GetMapping("/model/{model}")
    public ResponseEntity<List<Veiculo>> getAllByValue(@PathVariable String model) {
        return new ResponseEntity<>(service.getByModel(model), HttpStatus.OK);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void save(@RequestBody Veiculo veiculo) {
        service.save(veiculo);
    }
}
