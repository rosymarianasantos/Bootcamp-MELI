package Repository;

import Model.Veiculo;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.List;
import java.util.Optional;
import java.io.File;

@Repository
public class VeiculoRepository {
    private final String arquivo = "src/main/resources/veiculos.json"; //final pra nao ser possivel modificar o comportamento, esse atributo nao é herdado
    ObjectMapper mapper = new ObjectMapper(); //tranforma o JSON em objeto JAVA e vice versa

    public Optional<Veiculo> getVeiculo(String placa) {
        List<Veiculo> veiculos = null;
        try {
            veiculos = Arrays.asList(mapper.readValue(new File(arquivo), Veiculo[].class));
        } catch (Exception ex) {
            System.out.println("Deu ruim no getVeiculo Repository");
        }
        for(Veiculo v: veiculos) {
            if(v.getPlaca().equals(placa)) {
                return Optional.of(v);
            }
        }
        return Optional.empty();
    }

    public List<Veiculo> getAll(){
        List<Veiculo> veiculos = null;
        try {
            veiculos = Arrays.asList(mapper.readValue(new File(arquivo), Veiculo[].class));
        } catch (Exception ex) {
            System.out.println("Deu ruim no getAll Repository");
        }
        return veiculos;
    }

    public void saveVeiculo(Veiculo novoVeiculo) {
        ObjectMapper mapper = new ObjectMapper();
        ObjectWriter writer = mapper.writer(new DefaultPrettyPrinter()); //pra escrever no arquivo no formato correto

        List<Veiculo> veiculos = getAll();

        veiculos = new ArrayList<>(veiculos);

        veiculos.add(novoVeiculo);

        try {
            writer.writeValue(new File(arquivo), veiculos);

        }catch (Exception ex) {
            System.out.println("Erro ao gravar o arquivo");
        }
    }

}
