package Encapsulamento.Ex5;

public class Investimento {
    private String tipoInvestimento;
    private double valorInicial;
    private double taxaAnual;

//    Regras de validação:
//    O valor inicial não pode ser menor que R$ 1000
//    A taxa anual deve estar entre 1% e 20%
//    Implemente:
//    calcularValorFuturo(int anos) usando juros compostos
//    exibirResumo() mostrando todos os dados e o valor final após os anos


    public void setTipoInvestimento(String tipoInvestimento) {
        this.tipoInvestimento = tipoInvestimento;
    }

    public void setValorInicial(double valorInicial) {
        if(valorInicial < 1000){
            System.out.println("NUM PODE!");
        }
        else{
            this.valorInicial = valorInicial;
        }

    }

    public void setTaxaAnual(double taxaAnual) {
        if(taxaAnual >= 1 && taxaAnual <= 20){
            this.taxaAnual = taxaAnual;
        }
        else{
            System.out.println("NUM PODE!");
        }

    }

    public String getTipoInvestimento() {
        return tipoInvestimento;
    }

    public double getValorInicial() {
        return valorInicial;
    }

    public double getTaxaAnual() {
        return taxaAnual;
    }

    public double calcularValorFuturo(int anos){
//        M=C×(1+i)^t
//        Onde:
//        M = Montante final (capital + juros)
//        C = Capital inicial (valor investido ou emprestado)
//        i = Taxa de juros por período (em forma decimal → ex: 10% = 0,10)
//        t = Tempo (número de períodos)

        return valorInicial*Math.pow((1+(taxaAnual/100)),anos);

    }

    public void exibirIvestimenti(){
        System.out.println("Tipo de envistimeto: " + tipoInvestimento);
        System.out.printf("Taxa anual: %.2f%% ", taxaAnual);
        System.out.println("\nValor inicial: " + valorInicial);
    }

}
