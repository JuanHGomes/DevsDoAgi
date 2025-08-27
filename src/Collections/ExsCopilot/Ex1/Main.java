package Collections.ExsCopilot.Ex1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
//Crie uma lista de nomes e ordene-a em ordem alfabética.
//Depois, remova todos os nomes que começam com a letra "A".
public class Main {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<String>();

        nomes.add("Juan");
        nomes.add("Erick");
        nomes.add("Alisson");
        nomes.add("Guilherme");

        Collections.sort(nomes);

        nomes.removeIf(nome -> nome.startsWith("A"));

        System.out.println(nomes.toString());

    }
}
