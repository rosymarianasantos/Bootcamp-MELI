package P2EX1;
import java.util.List;
import java.util.Comparator;

public class Garagem {
    int ID;
    List<Veiculo> listaVeiculos;

    public Garagem(int ID, List<Veiculo> listaVeiculos) {
        this.ID = ID;
        this.listaVeiculos = listaVeiculos;
    }

    public int getID() {
        return ID;
    }

    public List<Veiculo> getListaVeiculos() {
        return listaVeiculos;
    }

    public void setListaVeiculos(List<Veiculo> listaVeiculos) {
        this.listaVeiculos = listaVeiculos;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void Cresc() {
        listaVeiculos.stream().sorted(Comparator.comparing(Veiculo::getPreco)).forEach(System.out::println);
    }

    public void OrderMarca() {
        listaVeiculos.stream().sorted(Comparator.comparing(Veiculo::getMarca)).forEach(System.out::println);
    }

    public void MenorMil(Double valor) {
        listaVeiculos.stream().filter(veiculo -> veiculo.getPreco() < valor).forEach(System.out::println);
    }
    public void MaiorMil(Double valor) {
        listaVeiculos.stream().filter(veiculo -> veiculo.getPreco() >= valor).forEach(System.out::println);
    }
    public void Media() {
        System.out.println( listaVeiculos.stream().mapToDouble(n -> n.getPreco()).average().getAsDouble());
    }

}
