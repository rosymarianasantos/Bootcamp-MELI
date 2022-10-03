package Controller;

import DTO.SintomaDTO;
import Model.SintomaModel;
import Service.SintomaService;
import enity.Sintoma;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("sintomas")
public class SintomaController {
    @Autowired
    private SintomaService sintomaService;

    @PostMapping("save")
    public ResponseEntity<Sintoma> saveSymptom(@RequestBody Sintoma sintoma) {
        sintomaService.save(sintoma);
        return ResponseEntity.ok(sintoma);
    }

    @GetMapping("/findSymptom")
        public ResponseEntity<List<Sintoma>> getAllSymptom() {
        return ResponseEntity.ok(sintomaService.findAllSympton());
    }

   @GetMapping("/findSymptom/{name}")
    public ResponseEntity<List<SintomaDTO>> getByName(@PathVariable String name) {
       Optional<Sintoma> sintoma = sintomaService.findByName(name);
               if(sintoma.isPresent()){
                   return new ResponseEntity(SintomaDTO.convertToDTO(sintoma.get()), HttpStatus.ACCEPTED);
               }
               else {
                   return new ResponseEntity("Sintoma nao encontrado", HttpStatus.BAD_REQUEST);
               }
    }
}
