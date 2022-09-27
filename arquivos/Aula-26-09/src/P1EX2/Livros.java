package P1EX2;

public class Livros implements Impressao{
    int numeroPg;
    String autor;
    String titulo;
    String genero;

    public Livros(int numeroPg, String autor, String titulo, String genero) {
        this.numeroPg = numeroPg;
        this.autor = autor;
        this.titulo = titulo;
        this.genero = genero;
    }
}
