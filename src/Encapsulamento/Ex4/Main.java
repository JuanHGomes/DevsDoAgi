package Encapsulamento.Ex4;

public class Main {
    public static void main(String[] args) {
        ItemCarrinho item1 = new ItemCarrinho();
        item1.setProduto("Churros do amor");
        item1.setPrecoUnitario(10);
        item1.setQuantidade(100);

        System.out.println(item1.calcularSubtotal());
    }
}
