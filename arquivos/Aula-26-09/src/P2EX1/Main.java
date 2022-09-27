package P2EX1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Veiculo>  listaVeiculos = new ArrayList<>();

        listaVeiculos.add(new Veiculo("Ford", "Fiesta", 1000.0));
        listaVeiculos.add(new Veiculo("Ford", "Focus", 1200.0));
        listaVeiculos.add(new Veiculo("Ford", "Explorer", 2500.0));
        listaVeiculos.add(new Veiculo("Fiat", "Uno", 500.0));
        listaVeiculos.add(new Veiculo("Fiat", "Cronos", 1000.0));
        listaVeiculos.add(new Veiculo("Fiat", "Torino", 1250.0));
        listaVeiculos.add(new Veiculo("Chevrolet", "Aveo", 1250.0));
        listaVeiculos.add(new Veiculo("Chevrolet", "Spin", 2500.0));
        listaVeiculos.add(new Veiculo("Toyota", "Corola", 1200.0));
        listaVeiculos.add(new Veiculo("Toyota", "Fortuner", 3000.0));
        listaVeiculos.add(new Veiculo("Renault", "Logan", 950.0));

        Garagem garagem = new Garagem(1, listaVeiculos);

        //System.out.println("Preço do menor para o maior");
        //garagem.Cresc();
       // System.out.println("Marca do menor para o maior");
       // garagem.OrderMarca();
        //System.out.println("veículos com preço não superior a 1000");
        //garagem.MenorMil(1000.0);
        //System.out.println("veículos com preços maiores ou iguais a 1000");
       //garagem.MaiorMil(1000.0);
        System.out.println("preço médio total");
        garagem.Media();
    }

}
