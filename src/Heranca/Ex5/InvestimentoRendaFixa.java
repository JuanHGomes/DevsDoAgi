package Heranca.Ex5;

public class InvestimentoRendaFixa extends Investimento {
    private double taxaAnual;
    private int periodoMeses;

    public InvestimentoRendaFixa(String codigo, double valorInicial, double taxaAnual, int periodoMeses){
        super(codigo, valorInicial);
        this.taxaAnual = taxaAnual;
        this.periodoMeses = periodoMeses;
    }

    public double calcularValorFinal(){
        return valorIncial*(1+taxaAnual*(periodoMeses/12));
    }
}
