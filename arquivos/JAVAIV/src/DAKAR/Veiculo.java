package DAKAR;

public class Veiculo {
    double velocidade;
    double aceleracao;
    double angulo;
    String placa;
    double peso;
    int rodas;

    public Veiculo(double velocidade, double aceleracao, double angulo, String placa, double peso, int rodas) {
        this.velocidade = velocidade;
        this.aceleracao = aceleracao;
        this.angulo = angulo;
        this.placa = placa;
        this.peso = peso;
        this.rodas = rodas;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

    public double getAceleracao() {
        return aceleracao;
    }

    public void setAceleracao(double aceleracao) {
        this.aceleracao = aceleracao;
    }

    public double getAngulo() {
        return angulo;
    }

    public void setAngulo(double angulo) {
        this.angulo = angulo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getRodas() {
        return rodas;
    }

    public void setRodas(int rodas) {
        this.rodas = rodas;
    }

    @Override
    public String toString() {
        return "Veiculo{" +
                "velocidade=" + velocidade +
                ", aceleracao=" + aceleracao +
                ", angulo=" + angulo +
                ", placa='" + placa + '\'' +
                ", peso=" + peso +
                ", rodas='" + rodas + '\'' +
                '}';
    }
}
