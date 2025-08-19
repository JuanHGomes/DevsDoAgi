package Polimofismo.Ex1;

public class ContaCorrente extends Conta{
    private static final double imposto = 1.01;

    @Override
    public double calcularImposto(){
        return saldo * imposto;
    }
}
