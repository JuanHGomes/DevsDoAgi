package ClasseAbstrata.Ex2;

public class Main {
    public static void main(String[] args) {
        Cartao cartaoCredito = new CartaoCredito("666", 100, 100);
        Cartao cartaoDebito = new CartaoDebito("666", 100, 100);

        cartaoDebito.processarCompra(100);
        cartaoCredito.processarCompra(100);

        cartaoDebito.dadosCompra();
        cartaoCredito.dadosCompra();
    }
}
