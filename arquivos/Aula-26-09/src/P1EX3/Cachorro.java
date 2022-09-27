package P1EX3;

public class Cachorro extends Animal{
    private String som = "auau";
    private String gostoAlimentar = "carnívoro";

    @Override
    public void som() {
        System.out.println("O cachorro faz " + som);
    }
    @Override
    public void comer() {
        System.out.println("O cachorro é " + gostoAlimentar);
    }
}
