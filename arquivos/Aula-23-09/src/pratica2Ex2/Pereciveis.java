package pratica2Ex2;

public class Pereciveis extends Produto {
    int diasParaVencer;

    public Pereciveis(String nome, double preco, int diasParaVencer) {
        super(nome, preco);
        this.diasParaVencer = diasParaVencer;
    }

    public int getDiasParaVencer() {
        return diasParaVencer;
    }

    public void setDiasParaVencer(int diasParaVencer) {
        this.diasParaVencer = diasParaVencer;
    }

    @Override
    public double calcular(int quantidadeDeProdutos) {
       switch (this.diasParaVencer) {
           case 1:
               return super.calcular(quantidadeDeProdutos)/4;
           case 2:
               return super.calcular(quantidadeDeProdutos)/3;
           case 3:
               return super.calcular(quantidadeDeProdutos)/2;
           default:
               return super.calcular(quantidadeDeProdutos);
       }
    }

}
