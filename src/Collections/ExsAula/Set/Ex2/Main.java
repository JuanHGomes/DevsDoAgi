package Collections.ExsAula.Set.Ex2;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<String> produtos = new HashSet<>();
        adicionarProduto(produtos, "Crédito do trabalhador");
        adicionarProduto(produtos, "Empréstimo pessoal");
        adicionarProduto(produtos, "Crédito do trabalhador");

        exibirProdutos(produtos);
    }

    static void adicionarProduto(Set<String> produtos, String nomeProduto){
        if(produtos.add(nomeProduto)){
            produtos.add(nomeProduto);
            System.out.println("Produto: " + nomeProduto + " contradado!");
        }
        else System.out.println("Produto " + nomeProduto+" já foi adquirido");
    }
    static void exibirProdutos(Set<String> produtos){
        System.out.println(produtos.toString());
    }
}
