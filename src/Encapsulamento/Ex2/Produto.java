package Encapsulamento.Ex2;

public class Produto {
    private String nome;
    private double preco;
    private int estoque;

    //preço não pode ser negativo e estoque só pode ser alterado via "Adicionar" e "Remover" estoque()

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public double getPreco(){
        return preco;
    }

    public void setPreco(double preco){
        if(preco >=0){
            this.preco = preco;
        }
        else{
            System.out.println("O preço precisa ser maior ou igual a R$0,00!");
        }
    }

    public int getEstoque(){
        return estoque;
    }

    public void adicionarEstoque(int quantidade){
        if(quantidade > 0){
            estoque =+ quantidade;
        }
        else {
            System.out.println("A quantidade a ser adicionada precisa ser maior que 0!");
        }

    }

    public void removerEstoque(int quantidade){
        if(quantidade > 0 && estoque >= quantidade){
            estoque -= quantidade;
        }
        else{
            System.out.println("A quantidade a ser removida precisa ser maior que 0!");
        }
    }

    public void exibirProduto(){
        System.out.println("Nome: " + getNome());
        System.out.println("Preço: " + getPreco());
        System.out.println("Estoque: " + getEstoque());
    }
}
