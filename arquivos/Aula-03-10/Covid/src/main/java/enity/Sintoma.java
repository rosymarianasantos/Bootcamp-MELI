package enity;

import lombok.Data;

@Data
public class Sintoma {
    private int codigo;
    private String nome;
    private Gravidade gravidade;
}
