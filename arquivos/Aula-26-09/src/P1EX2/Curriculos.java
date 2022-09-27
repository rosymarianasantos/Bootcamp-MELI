package P1EX2;
import java.util.List;

public class Curriculos extends Arquivo {
    String pessoa;
    List<String> habilidadesList;

    public Curriculos(String doc, String pessoa, List<String>  habilidadesList) {
        super(doc);
        this.pessoa = pessoa;
        this.habilidadesList= habilidadesList;
    }

    public String getPessoa() {
        return pessoa;
    }

    public List<String> getHabilidadesList() {
        return habilidadesList;
    }

    public void setPessoa(String pessoa) {
        this.pessoa = pessoa;
    }

    public void setHabilidadesList(List<String> habilidadesList) {
        this.habilidadesList = habilidadesList;
    }

    @Override
    public String toString() {
        return  "Curriculo {" +
                "Habilidades=" +  habilidadesList +
                ", Pessoa='" + pessoa + '\'' + '}';
    }

}
