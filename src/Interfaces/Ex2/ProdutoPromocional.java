package Interfaces.Ex2;

public class ProdutoPromocional implements IDescontavel{
    @Override
    public double calcularPrecoFinal(double precoBase) {
        return precoBase*0.80;
    }
}
