package Construtores.Ex1;

public class ContaBancaria {

    private String titular;
    private String numeroConta;
    private double saldo;

//    Implemente os seguintes construtores:
//    Um construtor sem parâmetros que inicialize titular e numeroConta com strings vazias e saldo com zero.
//    Um construtor que receba titular e numeroConta, inicializando saldo com zero.
//    Um construtor que receba todos os três atributos.

    public ContaBancaria(){
        titular = "Vazio";
        numeroConta = "Vazio";
        saldo = 0.0;
    }

    public ContaBancaria(String titular, String numeroConta){
        this.titular = titular;
        this.numeroConta = numeroConta;
    }

    public ContaBancaria(String titular, String numeroConta, double saldo ){
        this(titular, numeroConta);
        this.saldo = saldo;
    }

    public void exibirConta(){
        System.out.println(titular);
        System.out.println(numeroConta);
        System.out.println(saldo);
    }

}
