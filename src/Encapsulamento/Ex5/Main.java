package Encapsulamento.Ex5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Investimento invest1 = new Investimento();
    invest1.setTipoInvestimento("Sei lá");
    invest1.setTaxaAnual(10);
    invest1.setValorInicial(1000);
    System.out.println("Digite o periodo a ser calculado: ");
    int anos = 2;

    invest1.exibirIvestimenti();

    System.out.printf("O valor acumulado em %d anos será %.2f" ,anos, invest1.calcularValorFuturo(anos));
    }
}
