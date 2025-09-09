package Collections.ExsAula.Map.Ex4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<String, List<Double>> emprestimos = new HashMap<>();
        adicionarParcela(emprestimos, "11111111111", 500);
        adicionarParcela(emprestimos, "11111111111", 300);
        adicionarParcela(emprestimos, "22222222222", 1000);
        exibirRelatorioDevedor(emprestimos);


    }

    static void adicionarParcela(Map<String, List<Double>> emprestimos, String cpf, double valorParcela){
        //adicionar uma nova parcela ao cliente
        emprestimos.putIfAbsent(cpf, new ArrayList<>());
        emprestimos.get(cpf).add(valorParcela);
    }

    static double totalDevedor(Map<String, List<Double>> emprestimos, String cpf){
        // retorna o total devedor de um cliente
        double saldoDevedor = 0;
        for( double val : emprestimos.get(cpf)){
            saldoDevedor += val;
        }
        return saldoDevedor;
    }

    static void exibirRelatorioDevedor(Map<String, List<Double>> emprestimos){
        //exibe o total devedor de todos os clientes
        emprestimos.forEach((cpf, parcelas) ->
                System.out.println("CPF " + cpf + " - Total Devedor: R$ " + totalDevedor(emprestimos, cpf)));


    }
}
