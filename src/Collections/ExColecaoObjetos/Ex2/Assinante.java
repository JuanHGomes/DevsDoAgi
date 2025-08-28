package Collections.ExColecaoObjetos.Ex2;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Assinante {
    private String id;
    private String nome;
    private String email;
    private Set<Assinante> assinantes = new HashSet<Assinante>();

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Assinante assinante = (Assinante) o;
        return Objects.equals(id, assinante.id) && Objects.equals(nome, assinante.nome) && Objects.equals(email, assinante.email) && Objects.equals(assinantes, assinante.assinantes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, email, assinantes);
    }



}
