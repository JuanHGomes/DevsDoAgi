package ClassesEObjetos.Ex2;

public class Main {
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria();
        conta1.titular = "Juan";
        conta1.numeroConta = "666";
        conta1.saldo = 1180.0;

        conta1.depositar(1000);
        conta1.sacar(10);
        conta1.exibirSaldo();
    }

}
