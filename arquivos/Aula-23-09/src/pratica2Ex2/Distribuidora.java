package pratica2Ex2;

public class Distribuidora {
    public static void main(String[] args) {
        Produto cafe = new NaoPereciveis("cafe", 20, "Industrializado" );
       // Produto oleo = new NaoPereciveis("oleo", 10, "Industrializado" );
        Produto carne = new Pereciveis("carne", 20, 2);
      //  Produto peixe = new Pereciveis("peixe", 10, 60);

        double soma = 0;
        soma += cafe.calcular(5);
        System.out.println("soma de 5 cafes " + soma);
        soma = 0;
        soma += carne.calcular(5);
        System.out.println("soma de 5 carnes " + soma);
    }

}
