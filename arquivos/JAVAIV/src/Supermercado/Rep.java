package Supermercado;

import java.util.List;
import java.util.Optional;

public interface Rep <T> {
    public void save (T objeto);
    public void mostrarTodos();
    public Optional<T> busca(int id);
    public void excluir(int id);
    public List<T> buscarTodos();
}
