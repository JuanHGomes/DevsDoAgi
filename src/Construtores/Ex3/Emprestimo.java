package Construtores.Ex3;

public class Emprestimo {
    private double valor;
    private double taxaJuros;
    private int prazoMeses;

    //Implemente:
    //Um construtor que receba valor e prazoMeses, inicializando taxaJuros com uma taxa padrão (exemplo: 1.5).
    //Um construtor que receba todos os três atributos.

    public Emprestimo(double valor){
        this.valor = valor;
        taxaJuros = 1.5;
    }

    public Emprestimo(double valor, double taxaJuros, int prazoMeses){
        this(valor);
        this.taxaJuros = taxaJuros;
        this.prazoMeses = prazoMeses;

    }

    public void exibir(){
        System.out.println(valor);
        System.out.printf("%.2f%% \n", taxaJuros);
        System.out.println(prazoMeses);
    }
}
