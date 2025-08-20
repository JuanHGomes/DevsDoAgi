package Polimofismo.Overriding.Ex4;

public class ContaPoupanca extends ContaBancaria{
    private static double rendimentoMensal = 5.0;

    public ContaPoupanca(String titular, double saldo) {
        super(titular, saldo);
    }

    @Override
    public void gerarRelatorio() {
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: " + saldo);
        System.out.printf("Rendimento mensal: %.2f%%", rendimentoMensal);
    }
}
