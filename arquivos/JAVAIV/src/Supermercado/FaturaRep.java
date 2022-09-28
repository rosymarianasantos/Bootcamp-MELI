package Supermercado;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class FaturaRep implements Rep<Fatura>{
    List<Fatura> Faturas = new ArrayList<>();

    @Override
    public void save(Fatura objeto) {
      Faturas.add(objeto);
    }

    @Override
    public void mostrarTodos() {
        for(Fatura f: Faturas) {
            System.out.println(f.toString());
        }
    }

    @Override
    public Optional<Fatura> busca(int id) {

        for(Fatura f: Faturas) {
            if(f.getPessoa().id == id) {
                System.out.println("Dados da fatura");
                System.out.println(f.toString());
                return Optional.of(f);

            }
        }
        System.out.println("Fatura nao encontrada");
        return Optional.empty();
    }

    @Override
    public void excluir(int id) {
        Optional<Fatura> fatura = this.busca(id);
        if(fatura.isEmpty()) {
            System.out.println("Fatura nao encontrado");
        }
        else {
            Faturas.remove(fatura.get());
            System.out.println("Fatura excluido com sucesso");
        }
    }

    @Override
    public List<Fatura> buscarTodos() {
        return Faturas;
    }
}
