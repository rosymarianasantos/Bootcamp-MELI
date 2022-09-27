
package pratica1;

public class Executivos implements Transacao {
    boolean temMoney;
    String tipo;

    public Executivos(String tipo, boolean temMoney) {
        this.tipo = tipo;
        this.temMoney = temMoney;
    }

    @Override
    public void transacaoNaoOk() {
        System.out.println("nao foi possivel fazer a transaçao");
    }

    @Override
    public void transacaoOk(String tipo) {
        System.out.println(tipo +"feito com sucesso");
    }

    public void Deposito() {
        if(temMoney && tipo == "Deposito") {
            this.transacaoOk(this.tipo);
        }
        else {
            this.transacaoNaoOk();
        }
    };
    public void Transferencia() {
        if(temMoney && tipo == "Transferencia") {
            this.transacaoOk(this.tipo);
        }
        else {
            this.transacaoNaoOk();
        }
    };
}