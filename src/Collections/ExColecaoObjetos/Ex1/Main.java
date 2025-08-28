package Collections.ExColecaoObjetos.Ex1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Cliente cliente1 = new Cliente("1", "Juan", "12345");
        Cliente cliente2 = new Cliente("2", "Erick", "666");
        Cliente cliente3 = new Cliente("3", "Guilherme", "1234567");
        Cliente cliente4 = new Cliente("4", "Douglas", "123");

        Cliente[] clientes = new Cliente[]{cliente1,cliente2, cliente3, cliente4 };

        for(Cliente cliente : clientes){
            Cliente.cadastrarClientes(cliente);
        }

        System.out.println(Cliente.buscarPorCpf("666"));

        Cliente.exibirClientes();
    }
}
