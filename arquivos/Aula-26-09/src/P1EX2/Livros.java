package P1EX2;

public class Livros extends  Arquivo{
    int numeroPg;
    String autor;
    String titulo;
    String genero;

    public Livros(String doc, int numeroPg, String autor, String titulo, String genero) {
        super(doc);
        this.numeroPg = numeroPg;
        this.autor = autor;
        this.titulo = titulo;
        this.genero = genero;
    }

    public int getNumeroPg() {
        return numeroPg;
    }

    public String getAutor() {
        return autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setNumeroPg(int numeroPg) {
        this.numeroPg = numeroPg;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return  "Livro {" +
                "numeroPaginas=" + numeroPg +
                ", autor='" + autor + '\'' +
                ", titulo='" + titulo + '\'' +
                ", genero='" + genero + '\'' +
                '}';
    }
}
