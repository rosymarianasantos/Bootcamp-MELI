package P1EX3;

public class Vaca extends Animal {
    private String som = "muuu";
    private String gostoAlimentar = "herbívora";

    @Override
    public void som() {
        System.out.println("A vaca faz " + som);
    }

    @Override
    public void comer() {
        System.out.println("A vaca é " + gostoAlimentar);
    }

}
