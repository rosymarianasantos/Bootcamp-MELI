package DTO;

import enity.Pessoa;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.stream.Collectors;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PessoaDTO {
    private String nome;
    private String sobrenome;

    public static PessoaDTO convertToDTO(Pessoa pessoa) {
        return new PessoaDTO(pessoa.getNome(), pessoa.getSobrenome());
    }

    public static List<PessoaDTO> convertListtoDTO(List<Pessoa> pessoaList) {
        return pessoaList.stream().map(p -> new PessoaDTO(p.getNome(), p.getSobrenome()))
                .collect(Collectors.toList());
    }

}
