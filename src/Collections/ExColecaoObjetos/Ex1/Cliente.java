package Collections.ExColecaoObjetos.Ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.SplittableRandom;

public class Cliente {
    private String id;
    private String nome;
    private String cpf;
    private static List<Cliente> clientes = new ArrayList<Cliente>();

    public Cliente(String id, String nome, String cpf) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
    }

    private String getCpf() {
        return cpf;
    }

    public static void cadastrarClientes(Cliente cliente){
        clientes.add(cliente);
    }

    public static void exibirClientes(){
        for(Cliente cliente : clientes){
            System.out.println(cliente.toString());
        }
    }

    public static Optional<Cliente> buscarPorCpf(String cpf){

        return clientes.stream().filter(cliente -> cliente.getCpf().equals(cpf)).findFirst();

    }

    @Override
    public String toString() {
        return "Cliente{" +
                "id='" + id + '\'' +
                ", nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                '}';
    }
}
