package Heranca.Ex1;

import org.w3c.dom.ls.LSOutput;

public class ContaCorrente extends ContaBancaria{
    private double limiteChequeEspecial;

    public ContaCorrente(String titular, String numeroConta, double saldo, double limiteChequeEspecial){
      super(titular, numeroConta, saldo);
      this.limiteChequeEspecial = limiteChequeEspecial;
    }

    public void sacarComChequeEspecial(double valor){
        //saque até o limite do cheque especial

        if(valor <= limiteChequeEspecial){
            limiteChequeEspecial -= valor;
            System.out.println("Saque realizado com sucesso!");
        }
        else {
            System.out.println("Limite de cheque especial insuficiente!");
        }
    }
}
