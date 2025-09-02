package Hackathons.MiniHackathon25_08.EncapsulamentoHeranca;

public class Funcionario {
    private String nome;
    private double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    public void exibirFuncionario(){
        System.out.println("\nNome: "+ nome);
        System.out.printf("Salario: R$%.2f", salario);
    }
}
