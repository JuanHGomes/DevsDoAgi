package Hackathons.MiniHackathon25_08.PolimorfismoAbstracao;

public class RendaVariavel extends Investimento{

    public RendaVariavel(double valorInicial) {
        super(valorInicial);
    }


    @Override
    public void calcularRendimento() {
        double rendimento = valorInicial*1.10;
        System.out.printf("\nRenda variável: O seu saldo com rendimentos é: R$%.2f",rendimento);
    }
}
