package Service;

import Model.PessoaModel;
import Repository.PessoaRepository;
import enity.Pessoa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PessoaService {

    private PessoaRepository pessoaRepository;

    public void savePessoa(Pessoa pessoa){
        pessoaRepository.savePessoa(pessoa);
    }
    @Autowired
    public List<Pessoa> getRiskPerson() {
        return pessoaRepository.getPessoaList().stream().filter(p-> p.getIdade()>60).collect(Collectors.toList());
    }
}
