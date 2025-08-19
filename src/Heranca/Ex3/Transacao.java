package Heranca.Ex3;

abstract class Transacao {
    protected String id;
    protected double valor;
    protected String data;

    public Transacao(String id, double valor, String data){
        this.id = id;
        this.valor = valor;
        this.data = data;
    }

}
