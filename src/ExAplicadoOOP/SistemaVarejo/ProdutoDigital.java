package ExAplicadoOOP.SistemaVarejo;

public class ProdutoDigital extends Produto{
    public ProdutoDigital(int codigo, String nome, double preco, Cliente comprador) {
        super(codigo, nome, preco, comprador);
    }

    @Override
    public double calcularFrete() {
        return 0;
    }
}
