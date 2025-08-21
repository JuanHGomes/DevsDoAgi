package ClasseAbstrata.Ex3;

public class RendaFixa extends Investimento{
    private static final double taxaJuros = 1.05;

    public RendaFixa(double valorAplicado) {
        super(valorAplicado);
    }

    @Override
    public double calcularRendimento(int tempo) {
        return calculoJuros(taxaJuros, tempo);
    }
}
