package ClasseAbstrata.Ex2;

public class CartaoCredito extends Cartao{
    public CartaoCredito(String numero, double limite, double saldoConta) {
        super(numero, limite, saldoConta);
    }

    @Override
    public void processarCompra(double valor) {
    limite -= valor;
    }
}
