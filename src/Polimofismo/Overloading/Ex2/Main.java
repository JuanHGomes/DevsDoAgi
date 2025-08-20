package Polimofismo.Overloading.Ex2;

public class Main {
    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        System.out.println(carrinhoDeCompras.calcularValorCompra(10,10));
        System.out.println(carrinhoDeCompras.calcularValorCompra(10,10,10));
        System.out.println(carrinhoDeCompras.calcularValorCompra(10,10,10,10));
    }
}
