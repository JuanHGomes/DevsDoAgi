package ClasseAbstrata.Ex3;

public class RendaVariavel extends Investimento{
    private static final double taxaJuros = 1.10;

    public RendaVariavel(double valorAplicado) {
        super(valorAplicado);
    }

    @Override
    public double calcularRendimento(int tempo) {
        return calculoJuros(taxaJuros, tempo);
    }
}
