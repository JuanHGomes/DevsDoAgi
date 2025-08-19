package Heranca.Ex3;

public class Main {
    public static void main(String[] args) {
    Transacao tr1 = new TransferenciaBancaria("24", 100, "19/08/2025", "666", "69");
    ((TransferenciaBancaria)tr1).resumoTransferencia();
    }
}
