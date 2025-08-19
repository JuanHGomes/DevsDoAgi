package ClassesEObjetos.Ex2;

public class ContaBancaria {
    public String titular;
    public String numeroConta;
    public double saldo;

    public void depositar(double valor){
        this.saldo += valor;
    }
    public void sacar(double valor){
        this.saldo -= valor;
    }
    public void exibirSaldo(){
        System.out.println(this.titular);
        System.out.println(this.numeroConta);
        System.out.println(String.valueOf(saldo));
    }
}
