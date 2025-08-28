package Collections.ExColecaoObjetos.Ex3;

import java.util.HashMap;
import java.util.Map;

public class Produto {
    private String codigo;
    private String nome;
    private int quantidade;
    private static Map<String, Produto> produtos = new HashMap<String, Produto>();

    public Produto(String codigo, String nome, int quantidade) {
        this.codigo = codigo;
        this.nome = nome;
        this.quantidade = quantidade;
    }

    public static void adicionarProduto(Produto produto){
        produtos.put(produto.codigo, produto);
    }
    public static Produto consultaPorCodigo(String codigo){
        return produtos.get(codigo);
    }

    @Override
    public String toString() {
        return "Produto{" +
                "codigo='" + codigo + '\'' +
                ", nome='" + nome + '\'' +
                ", quantidade=" + quantidade +
                '}';
    }

    public static void exibirProdutos(){
        produtos.forEach((codigo, produto) -> {
            System.out.println(produto);
        });
    }
}
