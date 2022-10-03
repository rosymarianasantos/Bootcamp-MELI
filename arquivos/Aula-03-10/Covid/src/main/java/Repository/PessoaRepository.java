package Repository;

import enity.Pessoa;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
@Data
@AllArgsConstructor
public class PessoaRepository {
    private List<Pessoa> pessoaList;

    public void savePessoa(Pessoa pessoa) {
        this.pessoaList.add(pessoa);
    }
}
