package Heranca.Ex1;

public class Main {
    public static void main(String[] args) {
    ContaBancaria conta1 = new ContaCorrente("Juan", "666", 500, 500);
    ((ContaCorrente)conta1).sacarComChequeEspecial(300);
    }
}
