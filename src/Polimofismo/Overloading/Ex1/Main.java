package Polimofismo.Overloading.Ex1;

public class Main {
    public static void main(String[] args) {
        CalculadoraFinanceira calculadora = new CalculadoraFinanceira();

        System.out.printf("%.2f \n",calculadora.calcularJuros(100));
        System.out.printf("%.2f \n",calculadora.calcularJuros(100,0.015));
        System.out.printf("%.2f \n",calculadora.calcularJuros(100,0.015,12));


    }
}
