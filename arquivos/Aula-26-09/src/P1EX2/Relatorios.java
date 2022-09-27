package P1EX2;

public class Relatorios extends Arquivo {
    int comprimento;
    String texto;
    int numeroPg;
    String autor;
    String revisor;

    public Relatorios(String doc, int comprimento, String texto, int numeroPg, String autor, String revisor) {
        super(doc);
        this.comprimento = comprimento;
        this.texto = texto;
        this.numeroPg = numeroPg;
        this.autor = autor;
        this.revisor = revisor;
    }

    public int getComprimento() {
        return comprimento;
    }

    public String getTexto() {
        return texto;
    }

    public int getNumeroPg() {
        return numeroPg;
    }

    public String getAutor() {
        return autor;
    }

    public String getRevisor() {
        return revisor;
    }

    public void setComprimento(int comprimento) {
        this.comprimento = comprimento;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public void setNumeroPg(int numeroPg) {
        this.numeroPg = numeroPg;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setRevisor(String revisor) {
        this.revisor = revisor;
    }

    @Override
    public String toString() {
        return  "Relatorio {" +
                "Textp =" +  texto +
                ", autor='" + autor+ '\'' +
                "numero de paginas " + numeroPg + '/' +
                "revisor " + revisor + '/' + '}';

    }

}
