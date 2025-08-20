package Polimofismo.Overriding.Ex4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaCorrente("Juan", 1000);
        ContaBancaria conta2 = new ContaPoupanca("Erick", 1000);


        List<ContaBancaria> contasList = new ArrayList<>();

        contasList.add(conta1);
        contasList.add(conta2);

        for(ContaBancaria conta : contasList){
            conta.gerarRelatorio();
        }
    }
}
