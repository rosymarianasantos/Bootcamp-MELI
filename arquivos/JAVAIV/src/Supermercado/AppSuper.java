package Supermercado;

import java.util.Scanner;

public class AppSuper {
    public static void main(String[] args) {
        ClienteRep cli = new ClienteRep();
        ItemRep it = new ItemRep();
        FaturaRep fat = new FaturaRep();

        Cliente cliente1 = new Cliente(1, "Fulano ", "da Silva");
        Cliente cliente2 = new Cliente(2, "Cicrano ", "dos Santos");
        Cliente cliente3 = new Cliente(3, "Humano ", "Nunes");

        cli.save(cliente1);
        cli.save(cliente2);
        cli.save(cliente3);

        cli.mostrarTodos();

        Scanner teclado = new Scanner(System.in);
        System.out.println("Insira o id do cliente");
        int id = teclado.nextInt();
        cli.busca(id);

        System.out.println("Insira o id do cliente");
        int idExc = teclado.nextInt();
        cli.excluir(idExc);

        Item item1 = new Item(123, "cafe", 2, 20.0);
        Item item2 = new Item(124, "bolo", 1, 8.0);
        Item item3 = new Item(125, "pao", 5, 0.8);

        it.save(item1);
        it.save(item2);
        it.save(item3);

        System.out.println("Insira o codigo do produto");
        int  codigo = teclado.nextInt();
        it.busca(codigo);

        System.out.println("Insira o codigo do produto");
        int codEx = teclado.nextInt();
        it.excluir(codEx);

        Fatura fatura = new Fatura(cliente1, it.buscarTodos());
        System.out.println(fatura.toString());
    }
}
