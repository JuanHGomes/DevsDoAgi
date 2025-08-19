package Heranca.Ex5;

public class Main {
    public static void main(String[] args) {
        Investimento invest1 = new InvestimentoRendaFixa("666", 1000, 10, 24);
        System.out.println("Valor ao final do período " + ((InvestimentoRendaFixa)invest1).calcularValorFinal());
    }
}
