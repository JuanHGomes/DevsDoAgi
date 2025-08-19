package Heranca.Ex2;

import java.time.LocalDate;
import java.util.Date;

public class ProdutoPerecivel extends Produto{
    private String dataValidade;

    public ProdutoPerecivel(String codigo, String nome, double preco, String dataValidade){
        super(codigo, nome, preco);
        this.dataValidade = dataValidade;
    }

    public boolean estaVencido(String dataAtual){
       return dataAtual.compareTo(dataValidade)>0;
    }
}
