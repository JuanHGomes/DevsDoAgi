package Polimofismo.Overriding.Ex2;

public class Main {
    public static void main(String[] args) {
    Investimento invest1 = new Poupanca();
    Investimento invest2 = new CDB();
    Investimento invest3 = new Investimento();

    Investimento[] investArray = new Investimento[] {invest1, invest2, invest3};

    for(Investimento invest : investArray){
        invest.calcularRendimento();
    }

    }
}
