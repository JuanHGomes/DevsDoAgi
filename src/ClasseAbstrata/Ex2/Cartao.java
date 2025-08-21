package ClasseAbstrata.Ex2;

public abstract class Cartao {
    protected String numero;
    protected double limite;
    protected double saldoConta;

    public Cartao(String numero, double limite, double saldoConta) {
        this.numero = numero;
        this.limite = limite;
        this.saldoConta = saldoConta;
    }

    public abstract void processarCompra(double valor);
    public final void dadosCompra(){
        System.out.println("Numero do cartão: " + numero);
        System.out.println("Saldo: "+ saldoConta);
        System.out.println("Limte restante: "+limite);
    }

}
