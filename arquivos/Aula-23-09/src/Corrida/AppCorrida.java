package Corrida;

import java.util.Scanner;

public class AppCorrida {
        private static Scanner scanner = new Scanner(System.in);
public static void main(String[] args) {
        boolean continuar = true;
    Inscricao ins = new Inscricao();
        while (continuar) {
        System.out.printf("Escolha uma opçao:%n ");
        System.out.printf( "1) Inscrever candidato e ver o valor a pagar;%n");
        System.out.printf("2) Encerrar programa;%n");
        int opcao = scanner.nextInt();
        switch (opcao) {
        case 1:
        Participante pess = ins.inscricao();
            double valor = ins.valorPago(pess);
            if(valor > 0.0) {
                System.out.printf("valor a pagar: " + valor);
            }
        break;
        case 2:
                continuar = false;
                break;
            default:
                System.out.printf("Opcao invalida %n");
        }
        }
        }

  }

