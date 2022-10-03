package Controller;

import DTO.PessoaDTO;
import Service.PessoaService;
import enity.Pessoa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("pessoa")
public class PessoaController {
    @Autowired //injecao ded dependencia
    private PessoaService pessoaService;

    @GetMapping("/findRiskPerson")
    public ResponseEntity<List<PessoaDTO>> getRiskPerson() {

        return ResponseEntity.ok(PessoaDTO.convertListtoDTO(pessoaService.getRiskPerson()));
    }

    @PostMapping("save")
    public ResponseEntity<Pessoa> savePessoa(@RequestBody Pessoa pessoa) {
        pessoaService.savePessoa(pessoa);
        return ResponseEntity.ok(pessoa);
    }

}
