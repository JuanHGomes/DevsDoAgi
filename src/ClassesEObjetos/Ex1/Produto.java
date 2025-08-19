package ClassesEObjetos.Ex1;

public class Produto{
    public String nome;
    public double preco;
    public int quantidade;

   public void adicionarEstoque(int quantidade){
        this.quantidade += quantidade;

    }
    public void removerEstoque(int quantidade){
        this.quantidade -= quantidade;

    }

    public void exibirDados(){
        System.out.println(this.nome);
        System.out.println(String.valueOf(this.preco));
        System.out.println(String.valueOf(this.quantidade));

    }
}

