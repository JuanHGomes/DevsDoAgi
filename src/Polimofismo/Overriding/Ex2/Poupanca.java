package Polimofismo.Overriding.Ex2;

public class Poupanca extends Investimento{

    @Override
    public void calcularRendimento(){
        System.out.println("Rende 5% ao mês!");
    }

}
