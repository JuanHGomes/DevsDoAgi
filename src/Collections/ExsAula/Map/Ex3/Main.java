package Collections.ExsAula.Map.Ex3;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Double> contas = new HashMap<String, Double> ();

       adicionarCliente(contas, "123", 100.0);
       adicionarCliente(contas, "345", 100.0);

       depositar(contas, "123", 50);

       exibirSaldos(contas);

    }

    static void adicionarCliente(Map<String, Double> contas, String numeroConta, double saldoInicial){
        //cadastra um cliente

        contas.put(numeroConta, saldoInicial);
    }

    static void depositar(Map<String, Double> contas, String numeroConta, double valor){
        //atualiza saldo apos deposito
        contas.put(numeroConta, contas.getOrDefault(numeroConta, 0.0)+valor);
    }

    static void exibirSaldos(Map<String, Double> contas){
        System.out.println(contas.toString());
    }
}
