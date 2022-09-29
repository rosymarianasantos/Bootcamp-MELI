package DAKAR;

public class Moto extends Veiculo{
    private static final double PESO = 300.00;
    private static final int RODAS = 2;

    public Moto(double velocidade, double aceleracao, double angulo, String placa, double peso, int rodas) {
        super(velocidade, aceleracao, angulo, placa, PESO, RODAS);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
