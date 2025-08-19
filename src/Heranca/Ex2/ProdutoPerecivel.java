package Heranca.Ex2;

import java.time.LocalDate;
import java.util.Date;

public class ProdutoPerecivel extends Produto{
    private LocalDate dataValidade;

    public ProdutoPerecivel(String codigo, String nome, double preco, LocalDate dataValidade){
        super(codigo, nome, preco);
        this.dataValidade = dataValidade;
    }

    public boolean estaVencido(LocalDate dataAtual){
       return dataAtual.isAfter(dataValidade);
    }
}
