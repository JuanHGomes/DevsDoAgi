package Excecoes.Ex2;

import java.sql.ClientInfoStatus;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Quantos valore você irá digitar?: ");
        int qtdPrecos = sc.nextInt();

        double[] precos = new double[qtdPrecos];

        try {
            for (int i = 0; i < qtdPrecos; i++) {
                System.out.println("Digite o preço n°" + (i + 1));
                double preco = Double.parseDouble(sc.next());
                precos[i] = preco;
            }
            System.out.println("Digite o dia a ser comparado: ");
            int dia = Integer.parseInt(sc.next());
            System.out.println(Ativos.mediaMovel(precos,dia));
        }
        catch (NumberFormatException e){
            System.out.println("Digite um número válido! ");
        }
        catch (IllegalArgumentException e){
            System.out.println("Deve ser digitado no mínimo 3 valores");
        }
    }
}
