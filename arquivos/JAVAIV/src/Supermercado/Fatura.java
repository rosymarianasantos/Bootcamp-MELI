package Supermercado;

import java.util.List;

public class Fatura {
    Cliente pessoa;
    List<Item> ListaItens;
    double total;

    public Fatura(Cliente pessoa, List<Item> listaItens) {
        this.pessoa = pessoa;
        ListaItens = listaItens;
    }

    public Cliente getPessoa() {
        return pessoa;
    }

    public void setPessoa(Cliente pessoa) {
        this.pessoa = pessoa;
    }

    public List<Item> getListaItens() {
        return ListaItens;
    }

    public void setListaItens(List<Item> listaItens) {
        ListaItens = listaItens;
    }

    public double getTotal() {
        this.total = 0;
        for(Item i: ListaItens) {
            total+=i.getCustoUni()*i.getQuant();
        }
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Fatura{" +
                "pessoa=" + pessoa +
                ", ListaItens=" + ListaItens +
                ", total=" + total +
                '}';
    }
}
