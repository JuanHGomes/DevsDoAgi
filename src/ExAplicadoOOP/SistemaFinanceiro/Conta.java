package ExAplicadoOOP.SistemaFinanceiro;

//Mais uma vez, sua classe está bem estruturada e aplicada.
public abstract class Conta implements IOperacoesBancarias{
    private String numeroConta;
    private double saldo =0;
    private String titular;


    public Conta(String numeroConta, String titular) {
        setNumeroConta(numeroConta);
        setTitular(titular);
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public void sacar(double valor) {
        saldo -= valor;
    }

    public abstract void aplicarJuros();

    public final void mostrarDadosConta(){
        System.out.println("Numero da conta: "+numeroConta);
        System.out.println("Titular: "+titular);
        System.out.println("Saldo atual: "+saldo);
        System.out.println();
    }
}
