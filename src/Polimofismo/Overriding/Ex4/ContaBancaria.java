package Polimofismo.Overriding.Ex4;

public class ContaBancaria {
    protected String titular;
    protected double saldo;

    public ContaBancaria(String titular, double saldo){
        this.titular = titular;
        this.saldo = saldo;

    }

    public void gerarRelatorio(){
        System.out.println("Relatório genérico");
    }


}
