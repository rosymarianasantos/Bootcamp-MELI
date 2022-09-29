package DAKAR;

public class Carros extends Veiculo{
    private static final double PESO = 1000.00;
    private static final int RODAS = 4;

    public Carros(double velocidade, double aceleracao, double angulo, String placa, double peso, String rodas) {
        super(velocidade, aceleracao, angulo, placa, PESO, RODAS);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
