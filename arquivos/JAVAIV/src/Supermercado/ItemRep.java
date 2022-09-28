package Supermercado;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ItemRep implements Rep<Item>{
    List<Item> Items = new ArrayList<>();

    @Override
    public void save(Item objeto) {
        Items.add(objeto);
    }

    @Override
    public void mostrarTodos() {
        for(Item i: Items) {
            System.out.println(i.toString());
        }
    }

    @Override
    public Optional<Item> busca(int id) {

        for(Item i: Items) {
            if(i.getCodigo() == id) {
                System.out.println("Dados do Item");
                System.out.println(i.toString());
                return Optional.of(i);

            }
        }
        System.out.println("Item nao encontrado");

        return Optional.empty();
    }

    @Override
    public void excluir(int id) {
        Optional<Item> item = this.busca(id);
        if(item.isEmpty()) {
            System.out.println("Item nao encontrado");
        }
        else {
            Items.remove(item.get());
            System.out.println("Item excluido com sucesso");
        }
    }

    @Override
    public List<Item> buscarTodos() {
        return Items;
    }
}
