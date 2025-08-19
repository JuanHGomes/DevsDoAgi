package Construtores.Ex4;

public class ClienteVarejo {
    private String nome;
    private String cpf;

    //Implemente:
    //Um construtor sem parâmetros que inicialize nome e cpf como strings vazias.
    //Um construtor que receba nome e cpf.

    public ClienteVarejo(){
        nome = "Vazio";
        cpf = "Vazio";
    }

    public ClienteVarejo(String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
    }

    public void exibir(){
        System.out.println(nome);
        System.out.println(cpf);
    }
}
