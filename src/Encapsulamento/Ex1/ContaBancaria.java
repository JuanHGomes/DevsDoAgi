package Encapsulamento.Ex1;

public class ContaBancaria {
    private String titular;
    private String numeroConta;
    private double saldo;

    public void setTitular(String titular){
        this.titular = titular;
    }

    public void setNumeroConta(String numeroConta){
        this.numeroConta = numeroConta;
    }
    public String getTitular(){
        return titular;
    }

    public String getNumeroConta(){
        return numeroConta;
    }
    private double getSaldo(){
        return saldo;
    }
    public void depositar(double valor){
        //precisa ser positivo
        if(valor > 0){
            saldo += valor;
        }
        else{
            System.out.println("O valor a ser depositado precisar ser maior que R$ 0,00");
        }
    }

    public void sacar(double valor){
        if(saldo >= valor){
            saldo -= valor;
        }
        else{
            System.out.println("Saldo insuficiente!");
        }
    }
    public void exibirExtrato(){
        System.out.println("Titular: "+ getTitular());
        System.out.println("Número da conta: "+ getNumeroConta());
        System.out.println("Saldo: " + getSaldo());
    }

}
