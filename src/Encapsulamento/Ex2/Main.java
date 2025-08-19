package Encapsulamento.Ex2;

public class Main {
    public static void main(String[] args) {
        Produto prod1 = new Produto();

        prod1.setNome("Morango do amor");
        prod1.setPreco(666.666);

        prod1.exibirProduto();

        prod1.adicionarEstoque(10);
        prod1.removerEstoque(5);

        prod1.exibirProduto();

    }
}
