package Collections.ExsAula.Set.Ex1;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Integer> contas = new HashSet<Integer>();
        adicionarConta(contas, 123);
        adicionarConta(contas, 345);
        adicionarConta(contas, 567);
        adicionarConta(contas, 123);

        exibirContas(contas);

    }
    static void adicionarConta(Set<Integer> contas, int numeroConta){
        //adiciona uma conta ao conjunto
        if(!existeConta(contas, numeroConta)) {
            contas.add(numeroConta);
            System.out.println("Conta cadastrada com sucesso!");
        }
        else System.out.println("Conta já cadastrada");

    }

    static boolean existeConta(Set<Integer> contas, int numeroConta){
        // verifica se a conta já esta cadastrada
        return contas.contains(numeroConta);
    }

    static void exibirContas(Set<Integer> contas){
        System.out.println(contas.toString());

    }
}
