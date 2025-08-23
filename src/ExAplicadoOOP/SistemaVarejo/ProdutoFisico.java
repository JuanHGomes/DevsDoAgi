package ExAplicadoOOP.SistemaVarejo;


public class ProdutoFisico extends Produto {

    public ProdutoFisico(int codigo, String nome, double preco, Cliente comprador) {
        super(codigo, nome, preco, comprador);
    }

    @Override
    public double calcularFrete() {
        return 20.0;
    }


}


