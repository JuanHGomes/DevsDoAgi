package Interfaces.Ex2;

public class MainProduto {
    public static void main(String[] args) {
        ProdutoComum prodComum = new ProdutoComum();
        ProdutoPromocional prodPromocional = new ProdutoPromocional();

        System.out.printf("O preço com desconto de 5%% é %.2f\n", prodComum.calcularPrecoFinal(100));
        System.out.printf("O preço com desconto de 20%% é %.2f\n", prodPromocional.calcularPrecoFinal(100));
    }



}
