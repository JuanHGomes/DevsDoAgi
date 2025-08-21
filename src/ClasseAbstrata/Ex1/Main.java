package ClasseAbstrata.Ex1;

public class Main {
    public static void main(String[] args) {
        Conta contaCorrente = new ContaCorrente("666", 100);
        Conta contaPoupanca = new ContaPoupanca("666", 100);

        contaCorrente.atualizarMensal();
        contaPoupanca.atualizarMensal();

        contaCorrente.extratoConta();
        contaPoupanca.extratoConta();
    }
}
