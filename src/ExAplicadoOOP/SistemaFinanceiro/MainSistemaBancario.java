package ExAplicadoOOP.SistemaFinanceiro;

import java.util.Scanner;

//Todo seu projeto possui muita coesão, está bem aplicado o uso de orientação a objeto, usando os componentes de forma correta.
//Parabens, que cada vez você tenha mais sucesso na área S2.
//Sua pontuação é 100!!!!!
public class MainSistemaBancario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cliente cliente1 = new Cliente();
        System.out.println("Digite o nome do cliente: ");
        cliente1.setNome(sc.next());
        System.out.println("Digite o CPF do cliente: ");
        cliente1.setCpf(sc.next());

        ContaCorrente contaCorrente = new ContaCorrente("123", cliente1.getNome());
        ContaPoupanca contaPoupanca = new ContaPoupanca("123", cliente1.getNome());

        System.out.println("Conta corrente:");
        contaCorrente.mostrarDadosConta();
        System.out.println("Conta poupança:");
        contaPoupanca.mostrarDadosConta();

        System.out.println("Digite o valor para deposito na conta corrente: ");
        contaCorrente.depositar(sc.nextDouble());
        System.out.println("Digite o valor para saque na conta corrente: ");
        contaCorrente.sacar(sc.nextDouble());

        contaCorrente.aplicarJuros();
        System.out.println();

        System.out.println("Digite o valor para deposito na conta poupança: ");
        contaPoupanca.depositar(sc.nextDouble());
        System.out.println("Digite o valor para saque na conta poupança: ");
        contaPoupanca.sacar(sc.nextDouble());

        contaPoupanca.aplicarJuros();
        System.out.println();

        System.out.println("Conta corrente:");
        contaCorrente.mostrarDadosConta();
        System.out.println("Conta poupança:");
        contaPoupanca.mostrarDadosConta();

        sc.close();

    }
}
