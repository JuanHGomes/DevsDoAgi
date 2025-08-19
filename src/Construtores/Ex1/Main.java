package Construtores.Ex1;

public class Main {
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria();
        conta1.exibirConta();

        ContaBancaria conta2 = new ContaBancaria("Juan", "1234");

        conta2.exibirConta();

        ContaBancaria conta3 = new ContaBancaria("Juan", "1234", 1000);
        conta3.exibirConta();
    }
}
