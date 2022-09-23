package pratica2;

public class PraticaExcecoes {
    public static void main(String[] args) {
        int a = 0;
        int b = 300;

        dividir(a, b);
        try {
            dividirDenovo(a, b);
        } catch (IllegalArgumentException deuRuim) {
            System.out.println(deuRuim.getMessage());
        }
        }

    public static void dividir(int a, int b) {
        try {
            double divisao = b/a;
        } catch (ArithmeticException deuRuim) {
            System.out.println("Ocorreu um erro");
        } finally {
            System.out.println("Programa finalizado.");
        }
    }
    public static void dividirDenovo(int a, int b) {
        try {
            double divisao = b/a;
        } catch (ArithmeticException deuRuim) {
            throw  new IllegalArgumentException("Não pode ser dividido por zero");
        }finally {
            System.out.println("Programa finalizado.");
        }
    }

}
