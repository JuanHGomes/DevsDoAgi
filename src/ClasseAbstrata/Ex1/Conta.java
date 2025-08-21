package ClasseAbstrata.Ex1;

abstract class Conta {
    protected String numero;
    protected double saldo;

    public abstract void atualizarMensal();
    public final void extratoConta(){
        System.out.println("C/C: "+ numero);
        System.out.println("Saldo: " + saldo);

    };

}
