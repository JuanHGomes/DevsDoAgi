package Encapsulamento.Ex3;

public class Main {
    public static void main(String[] args) {
        ClienteVip cliente1 = new ClienteVip();
        cliente1.setNome("Juan");
        cliente1.setCpf("12345678901");
        cliente1.setLimiteDeCredito(1500);

        cliente1.exibirCliente();

    }
}
