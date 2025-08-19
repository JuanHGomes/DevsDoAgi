package Heranca.Ex2;

import javax.lang.model.element.ModuleElement;

public class Main {
    public static void main(String[] args) {
        Produto prodP1 = new ProdutoPerecivel("123","Banana", 100,"17/08/2025" );
        System.out.println("Está vencido? "+ ((ProdutoPerecivel)prodP1).estaVencido("19/08/2025"));
    }
}