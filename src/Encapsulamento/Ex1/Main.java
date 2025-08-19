package Encapsulamento.Ex1;

public class Main {
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria();

        conta1.setTitular("Juan");
        conta1.setNumeroConta("123456");

        conta1.exibirExtrato();

        conta1.depositar(666.666);
        conta1.sacar(10000);
    }
}
