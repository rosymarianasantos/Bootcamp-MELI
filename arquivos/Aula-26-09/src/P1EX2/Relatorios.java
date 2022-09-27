package P1EX2;

public class Relatorios implements Impressao {
    int comprimento;
    String texto[];
    int numeroPg;
    String autor;
    String revisor;

    public Relatorios(int comprimento, String[] texto, int numeroPg, String autor, String revisor) {
        this.comprimento = comprimento;
        this.texto = texto;
        this.numeroPg = numeroPg;
        this.autor = autor;
        this.revisor = revisor;
    }

}
