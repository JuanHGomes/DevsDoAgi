package ClasseAbstrata.Ex4;

public abstract class Emprestimo {
    protected double valor;
    protected double taxaJuros;

    abstract double calcularParcela(int meses);

}
