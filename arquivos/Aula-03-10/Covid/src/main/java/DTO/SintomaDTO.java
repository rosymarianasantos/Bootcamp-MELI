package DTO;

import enity.Gravidade;
import enity.Sintoma;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.lang.management.GarbageCollectorMXBean;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SintomaDTO {
    private String nome;
    private Gravidade gravidade;

    public static SintomaDTO convertToDTO(Sintoma sintoma) {
        return new SintomaDTO(sintoma.getNome(), sintoma.getGravidade());
    }
}
