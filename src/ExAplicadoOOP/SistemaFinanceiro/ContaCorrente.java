package ExAplicadoOOP.SistemaFinanceiro;

//Tudo certinho por aqui!!
public class ContaCorrente extends Conta{
    public ContaCorrente(String numeroConta, String titular) {
        super(numeroConta, titular);
    }

    @Override
    public void aplicarJuros() {
        System.out.println("Não há rendimentos.");
    }
}
