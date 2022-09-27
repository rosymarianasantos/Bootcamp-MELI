package pratica1;

public class Cobradores implements Transacao {
    boolean temSaldo;
    double money;
    String tipo;

    public Cobradores(String tipo, boolean temSaldo, double money) {
        this.tipo = tipo;
        this.temSaldo = temSaldo;
        this.money = money;
    }

    @Override
    public void transacaoNaoOk() {
        System.out.println("nao foi possivel fazer a transaçao");
    }

    @Override
    public void transacaoOk(String tipo) {
        System.out.println(tipo +"feito com sucesso");
    }

    public void Saldo() {
        System.out.println("Saldo " + this.money);
    };

    public void saque() {
        if(temSaldo && tipo == "Saque") {
            this.transacaoOk(tipo);
        }
        else {
            this.transacaoNaoOk();
        }
    };

}
