package ExAplicadoOOP.SistemaVarejo;

public abstract class Produto implements IOperacoesProduto {
    private int codigo;
    private String nome;
    private double preco;
    private Cliente comprador;

    public Produto(int codigo, String nome, double preco, Cliente comprador) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
        this.comprador = comprador;
    }

    public abstract double calcularFrete();

    @Override
    public void aplicarDesconto(double percentual) {
        preco *= 1-(percentual/100);
    }

    @Override
    public void aumentarPreco(double percentual) {

        preco *= 1+(percentual/100);

    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }
}
