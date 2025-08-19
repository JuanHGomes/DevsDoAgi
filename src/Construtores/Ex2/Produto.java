package Construtores.Ex2;

public class Produto {
    private String codigo;
    private String nome;
    private double preco;

//    Implemente:
//    Um construtor sem parâmetros que inicialize todos os atributos com valores padrão (strings vazias e preço zero).
//    Um construtor que receba codigo e nome, inicializando preco com zero.
//    Um construtor que receba todos os três atributos.

    public Produto(){
        codigo = "Vazio";
        nome = "Vazio";
        preco = 0;
    }

    public Produto(String codigo, String nome){
        this.codigo = codigo;
        this.nome = nome;
        preco = 0;
    }

    public Produto(String codigo, String nome, double preco){
        this(codigo, nome);
        this.preco = preco;
    }

    public void exibirProduto(){
        System.out.println(codigo);
        System.out.println(nome);
        System.out.println(preco);
    }
}
