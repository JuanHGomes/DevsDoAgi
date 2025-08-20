package Polimofismo.Overriding.Ex4;

public class ContaCorrente extends ContaBancaria{
    private static final double taxaManutencao = 20.0;

    public ContaCorrente(String titular, double saldo){
        super(titular, saldo);

    }
    public void gerarRelatorio(){
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: " + saldo);
        System.out.println("Taxa de manutenção: " + taxaManutencao);

    }
}
