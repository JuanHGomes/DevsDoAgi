package Collections.ExsCopilot.Ex2;

import java.util.HashSet;

//Crie um HashSet com alguns nomes de frutas, incluindo duplicatas.
//Verifique quantos elementos únicos existem e tente iterar sobre o conjunto.
public class Main {
    public static void main(String[] args) {
        HashSet<String> frutas = new HashSet<>();

        frutas.add("Banana");
        frutas.add("Caju");
        frutas.add("Tomate");
        frutas.add("Caqui");
        frutas.add("Caju"); // Ignorado, hashset não aceita duplicatas

        System.out.println(frutas.toString());
        System.out.println(frutas.size());
    }
}
