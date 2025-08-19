package Construtores.Ex3;

public class Main {
    public static void main(String[] args) {
        Emprestimo emp1 = new Emprestimo(1000);
        emp1.exibir();

        Emprestimo emp2 = new Emprestimo(1000, 10, 24);
        emp2.exibir();

    }
}
