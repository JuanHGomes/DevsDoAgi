package ClasseAbstrata.Ex2;

public class CartaoDebito extends Cartao{
    public CartaoDebito(String numero, double limite, double saldoConta) {
        super(numero, limite, saldoConta);
    }

    @Override
    public void processarCompra(double valor) {
    saldoConta -= valor;
    }
}
