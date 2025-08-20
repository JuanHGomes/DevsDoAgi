package Polimofismo.Overriding.Ex3;

public class EmprestimoEmpresarial extends Emprestimo{
    private static final double taxaJuros = 0.01;
    private static final double taxaFixa = 100;

    public EmprestimoEmpresarial(double valorEmprestado){
        super(valorEmprestado);
    }
    @Override
    public double calcularParcela(int meses) {
        return ((valorEmprestado*taxaJuros*meses)+valorEmprestado+taxaFixa)/meses;
    }
}
