package ClasseAbstrata.Ex3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Investimento invest1 = new RendaFixa(1000);
        Investimento invest2 = new RendaVariavel(1000);
        System.out.println("Digite o tempo do investimento(em meses): ");
        int tempo = sc.nextInt();

        System.out.printf("Renda Fixa: Em %d meses seu dineheiro renderá: R$ %.2f\n",tempo, invest1.calcularRendimento(tempo));
        System.out.printf("Renda Variável: Em %d meses seu dineheiro renderá: R$ %.2f\n",tempo, invest2.calcularRendimento(tempo));

        sc.close();

    }
}
