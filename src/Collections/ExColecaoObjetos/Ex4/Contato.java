package Collections.ExColecaoObjetos.Ex4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Contato {
    private String nome;
    private String telefone;
    private String email;
    private static Set<Contato> contatosSet = new HashSet<Contato>();
    private static List<Contato> contatosList = new ArrayList<Contato>();

    public Contato(String nome, String telefone, String email) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
    }

    public static void adicionarContato(Contato contato){
        contatosSet.add(contato);

    }

    public static void converterSetEmList(){
        for(Contato contato : contatosSet){
            contatosList.add(contato);
        }
    }

    public static void exibirContatos(){
        for(Contato contato : contatosList){
            System.out.println(contato);
        }

    }

    @Override
    public String toString() {
        return "Contato{" +
                "nome='" + nome + '\'' +
                ", telefone='" + telefone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
