package Polimofismo.Overloading.Ex1;

public class CalculadoraFinanceira {
    //Fórmula: J = C * i * t
    //J: Juros
    //C: Capital (valor inicial)
    //i: Taxa de juros (em decimal)
    //t: Tempo (em períodos, como meses ou anos).

    // Implemente uma classe CalculadoraFinanceira que seja capaz de calcular juros simples usando sobrecarga de métodos (overloading). A classe deve oferecer três versões do metodo calcularJuros:
    //Que receba o capital, a taxa de juros mensal e o tempo em meses.
    //Que receba apenas o capital e a taxa, assumindo que o tempo padrão seja de 12 meses.
    //Que receba apenas o capital, assumindo taxa padrão de 1.5% ao mês e tempo de 12 meses.
    //Em seguida, crie a classe MainCalculadoraFinanceira para testar as três variações do metodo.


    public double calcularJuros(double capital, double taxaJurosMes, int meses){
        return capital*taxaJurosMes*meses;
    }
    
    public double calcularJuros(double capital, double taxaJurosMes){
       int meses = 12;
    return capital*taxaJurosMes*meses;
    }

    public double calcularJuros(double capital){
        double taxaJurosMes = 0.015;
        int meses = 12;
        return capital*taxaJurosMes*meses;
    }

}
