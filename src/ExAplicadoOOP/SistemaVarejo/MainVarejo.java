package ExAplicadoOOP.SistemaVarejo;

import java.util.Scanner;

public class MainVarejo {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("Juan", "juan@gmail.com");
        Cliente cliente2 = new Cliente("Assis", "assis@outlook.com");

        Produto prod1 = new ProdutoFisico(123, "Morango do amor", 100, cliente1);
        System.out.println(prod1.getNome() +" : R$"+prod1.getPreco());
        Produto prod2 = new ProdutoDigital(1234, "Churros do amor", 100, cliente2 );
        System.out.println(prod2.getNome() +" : R$"+prod2.getPreco());

        prod1.aplicarDesconto(10);
        prod1.aumentarPreco(15);
        prod2.aplicarDesconto(10);
        System.out.println("Descontos e aumnentos aplicados");


        System.out.println();
        System.out.print(prod1.getNome() +" : R$"+prod1.getPreco());
        System.out.println(prod2.getNome() +" : R$"+prod2.getPreco());
        System.out.printf("Valor do frete de %s : %.2f \n", prod1.getNome(), prod1.calcularFrete());
        System.out.printf("Valor do frete de %s : %.2f \n", prod2.getNome(), prod2.calcularFrete());



    }
}
