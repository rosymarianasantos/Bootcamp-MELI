package P1EX2;

public abstract class Arquivo {
    private String doc;

    public Arquivo(String doc) {
        this.doc = doc;
    }
    @Override
    public String toString() {
        return "Documento {" + doc + "}" ;
    }
}
