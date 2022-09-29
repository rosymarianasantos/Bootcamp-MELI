package DAKAR;

import java.util.ArrayList;
import java.util.List;

public class Corrida {
    double distancia;
    double premio;
    String nome;
    int numVeiculos;
    List<Veiculo> veiculoList;

    private SalvaMoto socorroMoto;
    private Auto socorroCarro;

    public Corrida(double distancia, double premio, String nome, int numVeiculos) {
        this.distancia = distancia;
        this.premio = premio;
        this.nome = nome;
        this.numVeiculos = numVeiculos;

        this.socorroCarro = new Auto();
        this.veiculoList = new ArrayList<>();
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

    public void mostrarCarros() {
        for(Veiculo v: veiculoList) {
            System.out.println(v);
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

    public void socorroCarro(String placa) {
        for(Veiculo vec: veiculoList) {
            if(vec.getPlaca().equals(placa) && vec instanceof Carros) {
                socorroCarro.SocorristaCarro((Carros) vec);
                return;
            }
        }
        System.out.println("NENHUM CARRO COM ESTA PLACA NA CORRIDA!!!!");
    }

    public void socorroMoto(String placa) {
        for(Veiculo vec: veiculoList) {
            if(vec.getPlaca().equals(placa) && vec instanceof Moto) {
                socorroMoto.SocorristaMoto((Moto) vec);
                return;
            }
        }
        System.out.println("NENHUM CARRO COM ESTA PLACA NA CORRIDA!!!!");
    }
}
