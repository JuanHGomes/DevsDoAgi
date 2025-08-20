package Polimofismo.Overriding.Ex3;

public class EmprestimoPessoal extends Emprestimo{
    //Fórmula: J = C * i * t
    //J: Juros
    //C: Capital (valor inicial)
    //i: Taxa de juros (em decimal) = 2% ao mês
    //t: Tempo (em períodos, como meses ou anos).
    private static final double taxaJuros = 0.02;

    public EmprestimoPessoal(double valorEmprestado){
        super(valorEmprestado);

    }
    @Override
    public double calcularParcela(int meses){
        return ((valorEmprestado*taxaJuros*meses)+valorEmprestado)/meses;
    }

}
