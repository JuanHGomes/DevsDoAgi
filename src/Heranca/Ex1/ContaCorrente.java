package Heranca.Ex1;

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
        }
        else {
            System.out.println("Limite de cheque especial insuficiente!");
        }
    }
}
