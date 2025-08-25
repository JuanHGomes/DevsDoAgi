package MiniHackathon25_08.EncapsulamentoHeranca;

public class Gerente extends Funcionario{
    private static final double bonus = 2000;
    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public void exibirFuncionario() {
        super.exibirFuncionario();
        System.out.println("\nGerente");
        System.out.printf("Bonus: R$%.2f", bonus);
        System.out.println();
    }
}
