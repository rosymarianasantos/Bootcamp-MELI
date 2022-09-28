package Supermercado;

public class Item {
    int codigo;
    String nome;
    int quant;
    double custoUni;

    public Item(int codigo, String nome, int quant, double custoUni) {
        this.codigo = codigo;
        this.nome = nome;
        this.quant = quant;
        this.custoUni = custoUni;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuant() {
        return quant;
    }

    public void setQuant(int quant) {
        this.quant = quant;
    }

    public double getCustoUni() {
        return custoUni;
    }

    public void setCustoUni(double custoUni) {
        this.custoUni = custoUni;
    }

    @Override
    public String toString() {
        return "Item{" +
                "codigo=" + codigo +
                ", nome='" + nome + '\'' +
                ", quant=" + quant +
                ", custoUni=" + custoUni +
                '}';
    }
}
