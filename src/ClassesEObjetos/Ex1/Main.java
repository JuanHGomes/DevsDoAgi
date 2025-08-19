package ClassesEObjetos.Ex1;

public class Main {
    public static void main(String[] args) {
        Produto prod1 = new Produto();
        prod1.nome = "Morango do amor";
        prod1.preco =50.50;
        prod1.quantidade = 100;

        Produto prod2 = new Produto();
        prod2.nome = "Churros do amor";
        prod2.preco =75;
        prod2.quantidade = 5;

        prod1.adicionarEstoque(2);
        prod1.removerEstoque(4);
        prod1.exibirDados();
    }

}
