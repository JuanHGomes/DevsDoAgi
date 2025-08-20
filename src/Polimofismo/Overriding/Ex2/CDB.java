package Polimofismo.Overriding.Ex2;

public class CDB extends Investimento{

    @Override
    public void calcularRendimento(){
        System.out.println("Rende 1% ao mês!");
    }
}
