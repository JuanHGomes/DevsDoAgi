package ClasseAbstrata.Ex1;

public class ContaCorrente extends Conta{
    public ContaCorrente(String numero, double saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }

    @Override
    public void atualizarMensal() {
    saldo -= 15;
    }
}
