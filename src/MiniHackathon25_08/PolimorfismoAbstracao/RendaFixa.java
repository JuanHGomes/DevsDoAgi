package MiniHackathon25_08.PolimorfismoAbstracao;

public class RendaFixa extends Investimento{
    public RendaFixa(double valorInicial) {
        super(valorInicial);
    }


    @Override
    public void calcularRendimento() {
        double rendimento = valorInicial*1.05;
        System.out.printf("\nRenda fixa: O seu saldo com rendimentos é: R$%.2f",rendimento);
    }
}
