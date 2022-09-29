package DAKAR;

import java.util.List;

public class Corrida {
    double distancia;
    double premio;
    String nome;
    int numVeiculos;
    List<Veiculo> veiculoList;

    public Corrida(double distancia, double premio, String nome, int numVeiculos, List<Veiculo> veiculoList) {
        this.distancia = distancia;
        this.premio = premio;
        this.nome = nome;
        this.numVeiculos = numVeiculos;
        this.veiculoList = veiculoList;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public double getPremio() {
        return premio;
    }

    public void setPremio(double premio) {
        this.premio = premio;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumVeiculos() {
        return numVeiculos;
    }

    public void setNumVeiculos(int numVeiculos) {
        this.numVeiculos = numVeiculos;
    }

    public List<Veiculo> getVeiculoList() {
        return veiculoList;
    }

    public void setVeiculoList(List<Veiculo> veiculoList) {
        this.veiculoList = veiculoList;
    }
    public void addCarro(Carros carro) {
        if(numVeiculos > veiculoList.size()) {
            veiculoList.add(carro);
        }
    }

    public void addMoto(Moto moto) {
        if(numVeiculos > veiculoList.size()) {
            veiculoList.add(moto);
        }
    }

    public void deleteVeiculo(Veiculo veiculo) {
     veiculoList.remove(veiculo);
    }
    public void deleteVeiculoComPlaca(String placa) {
        for(Veiculo veiculo: veiculoList) {
            if(veiculo.getPlaca().equals(placa)){
                veiculoList.remove(veiculo);
            }
        }
    }

    public double Vencedor(Veiculo veiculo) {
        return veiculo.getAceleracao()*1/2*veiculo.getAceleracao()/(veiculo.getAngulo()*(veiculo.getPeso() - veiculo.getRodas()*100));
    }

}
