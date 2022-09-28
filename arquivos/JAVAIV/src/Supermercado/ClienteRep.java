package Supermercado;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ClienteRep implements Rep<Cliente> {
    List<Cliente> Clientes;

    public ClienteRep() {
        this.Clientes = new ArrayList<>();
    }

    @Override
    public void save(Cliente objeto) {
        Clientes.add(objeto);
    }

    @Override
    public void mostrarTodos() {
     for(Cliente c: Clientes) {
         System.out.println("ID: " + c.getId() +
                 " Nome: " + c.getNome() + "Sobrenome: " + c.getSobrenome());
     }
    }

    @Override
    public Optional<Cliente> busca(int id) {
        for(Cliente c: Clientes) {
            if(c.getId() == id) {
                System.out.println("Dados do Cliente");
                System.out.println("ID: " + c.getId() +
                        " Nome: " + c.getNome() + "Sobrenome: " + c.getSobrenome());
                return Optional.of(c);

            }
        }
        return Optional.empty();
    }

    @Override
    public void excluir(int id) {
        Optional<Cliente> cliente = this.busca(id);
        if(cliente.isEmpty()) {
            System.out.println("Cliente nao encontrado");
        }
        else {
            Clientes.remove(cliente.get());
            System.out.println("Cliente excluido com sucesso");
        }

    }

    @Override
    public List<Cliente> buscarTodos() {
        return Clientes;
    }
}
