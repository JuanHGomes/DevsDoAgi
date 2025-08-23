package ExAplicadoOOP.SistemaVarejo;

public abstract class Produto implements IOperacoesProduto {
    private String codigo;
    private String nome;
    private double preco;
    private Cliente comprador;

    public Produto(String codigo, String nome, double preco, Cliente comprador) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
        this.comprador = comprador;
    }

    public abstract void calcularFrete();

    public void aplicarDesconto(){

    }
    public void aplicarAumento(){

    }
}
