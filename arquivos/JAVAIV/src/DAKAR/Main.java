package DAKAR;

public class Main {
    public static void main(String[] args) {
        Corrida premio = new Corrida(56.0, 6000.0, "DAKAR", 5);

        Carros carroJoice = new Carros(100.0,202.0, 8.0, "123");
        Carros carroFilipe = new Carros(200.0,158.0, 8.0, "124");
        Carros carroThiago = new Carros(150.0,160.0, 8.0, "125");
        Carros carroPatricia = new Carros(120.0,180.0, 8.0, "126");
        Carros carroAna = new Carros(190.0,179.0, 8.0, "127");

        premio.addCarro(carroAna);
        premio.addCarro(carroJoice);
        premio.addCarro(carroFilipe);
        premio.addCarro(carroThiago);
        premio.addCarro(carroPatricia);

      double teste = premio.Vencedor(carroAna);
      System.out.println(teste);
      teste = premio.Vencedor(carroFilipe);
        System.out.println(teste);
        teste = premio.Vencedor(carroJoice);
        System.out.println(teste);
        teste = premio.Vencedor(carroThiago);
        System.out.println(teste);
       premio.deleteVeiculo(carroAna);
        premio.mostrarCarros();
        //premio.socorroCarro("123");
    }

}
