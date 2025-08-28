package Collections.ExColecaoObjetos.Ex3;

public class Main {
    public static void main(String[] args) {
        Produto produto1 = new Produto("123", "Morango do amor", 2);
        Produto produto2 = new Produto("125", "Churros do amor", 2);
        Produto produto3 = new Produto("126", "Banana do amor", 2);
        Produto produto4 = new Produto("127", "Telefone do amor", 2);
        Produto produto5 = new Produto("124", "Notebook do amor", 2);

        Produto[] produtos = new Produto[]{produto1,produto2, produto3,produto4, produto5};
        for(Produto produto : produtos){
            Produto.adicionarProduto(produto);
        }

        System.out.println((Produto.consultaPorCodigo("126")).toString());

        Produto.exibirProdutos();
    }
}
