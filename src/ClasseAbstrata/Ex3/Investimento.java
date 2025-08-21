package ClasseAbstrata.Ex3;

public abstract class Investimento {
    protected double valorAplicado;

    public Investimento(double valorAplicado) {
        this.valorAplicado = valorAplicado;
    }

    public abstract double calcularRendimento(int tempo);
    public final double calculoJuros(double taxaJuros, int tempo){
        return valorAplicado*Math.pow((taxaJuros), tempo);
    }

}
