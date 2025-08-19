package Encapsulamento.Ex4;

public class ItemCarrinho {
    private String produto;
    private int quantidade;
    private double precoUnitario;

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public void setQuantidade(int quantidade) {
        if(quantidade > 0){
            this.quantidade = quantidade;
        }

    }

    public void setPrecoUnitario(double precoUnitario) {
        if(precoUnitario > 0){
            this.precoUnitario = precoUnitario;
        }

    }

    public String getProduto() {
        return produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public double calcularSubtotal(){
        return quantidade * precoUnitario;
    }
}
