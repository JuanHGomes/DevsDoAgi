package Hackathons.MiniHackathon25_08.EncapsulamentoHeranca;

public class Analista extends Funcionario{
    private static final double bonus = 1000;

    public Analista(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public void exibirFuncionario() {
        super.exibirFuncionario();
        System.out.println("\nAnalista");
        System.out.printf("Bonus: R$%.2f", bonus);
        System.out.println();
    }
}
