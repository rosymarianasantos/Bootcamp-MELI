package pratica1;

public class main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        Pessoa pessoa2 = new Pessoa("Rosy", 28, "numeroID");
        Pessoa pessoa3 = new Pessoa("Rosy", 28, "numeroID", 167, 60);

        boolean maiorIdade = pessoa3.ehMaiorIdade();
        int imc = pessoa3.calcularIMC();

        if(maiorIdade) {
            System.out.println("é maior de idade");
        }
        else {
            System.out.println("é menor de idade");
        }

        switch (imc) {
            case -1:
                System.out.println("Abaixo do peso");
                break;
            case 0:
                System.out.println("Peso Saudável");
                break;
            case 1:
                System.out.println("Sobrepeso");
                break;
        }
    }

}
