package Corrida;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Inscricao {
    Participante pessoa;

    public Scanner scanner = new Scanner(System.in);
    public List<Participante> participante = new ArrayList<>();

    public Inscricao() {
    }

      public Participante inscricao() {
        System.out.print("Informe o RG: ");
        int rg = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Primeiro Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Sobrenome: ");
        String sobrenome = scanner.nextLine();
        System.out.print("Numero de Celular (xx)xxxxx-xxxx: ");
        String telefone = scanner.nextLine();
        System.out.print("Numero de Emergência (xx)xxxxx-xxxx: ");
        String emergencia = scanner.nextLine();
        System.out.print("Grupo Sanguíneo: ");
        String grupoSanguineo = scanner.nextLine();
        System.out.print("Categoria: ");
        int categoria = scanner.nextInt();
        System.out.print("Idade: ");
        int idade = scanner.nextInt();

              return new Participante(rg, nome, sobrenome, telefone, emergencia, grupoSanguineo, categoria, idade);

          }
    public double valorPago(Participante pess) {
        switch (pess.categoria) {
            case 1:
                if(pess.idade < 18) {
                    return 1300.00;
                }
                else return 1500.00;
            case 2:
                if(pess.idade < 18) {
                    return 2000.00;
                }
                else return 2300.00;
            case 3:
                if(pess.idade < 18) {
                    System.out.printf("Incrisçao nao permitida %n");
                    return 0.0;
                }
                else return 2800.00;
            default:
                System.out.printf("categoria invalida %n");
                return 0.0;
        }
    }
}
