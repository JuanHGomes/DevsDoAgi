package Construtores.Ex4;

public class Main {
    public static void main(String[] args) {
        ClienteVarejo cli1 = new ClienteVarejo();
        cli1.exibir();

        ClienteVarejo cli2 = new ClienteVarejo("Juan", "1234566");
        cli2.exibir();
    }
}
