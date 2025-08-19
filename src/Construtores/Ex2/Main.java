package Construtores.Ex2;

public class Main {
    public static void main(String[] args) {
        Produto prod1 = new Produto();
        prod1.exibirProduto();

        Produto prod2 = new Produto("666", "Uvas");
        prod2.exibirProduto();

        Produto prod3 = new Produto("666", "Uvas", 10);
        prod3.exibirProduto();
    }
}
