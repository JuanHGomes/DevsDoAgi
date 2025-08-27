package Excecoes.Ex1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] saldos = new double[]{10,20,30,40,50,60,70,80,90,100};

        System.out.println("Digite o indice da conta: ");
        int index = sc.nextInt();

        try {
            System.out.println(saldos[index]);
        }
        catch (IndexOutOfBoundsException e){
            System.out.println("Conta não encontrada: "+e.getMessage());
        }
    }
}
