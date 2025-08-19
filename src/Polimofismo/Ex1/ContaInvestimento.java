package Polimofismo.Ex1;

public class ContaInvestimento extends Conta{
    //ContaInvestimento: cobra 15% sobre os rendimentos (diferença entre saldo e valor investido).
    private static final double imposto = 1.15;
    private double valorInvestido;


    @Override
    public double calcularImposto(){
        return (saldo - valorInvestido)*imposto;
    }
}
