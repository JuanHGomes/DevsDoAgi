package Heranca.Ex4;

public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new ClienteVip("Juan", "12345678", 5,10);
        System.out.println("O preço com desconto é: "+ ((ClienteVip)cliente1).calcularPrecoComDesconto(1000));

    }
}
