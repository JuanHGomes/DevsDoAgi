package ClasseAbstrata.Ex1;

public class ContaPoupanca extends Conta{
    public ContaPoupanca(String numero, double saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }

    @Override
    public void atualizarMensal() {
    saldo *=1.05;
    }
}
