package MiniHackathon25_08.PolimorfismoAbstracao;

public class Main {
    public static void main(String[] args) {
        Investimento rendaFixa = new RendaFixa(1000);
        Investimento rendaVariavel = new RendaVariavel(1000);

        Investimento[] investVetor = new Investimento[]{rendaFixa,rendaVariavel};

        for (Investimento invest : investVetor){
            invest.calcularRendimento();

        }
    }
}
