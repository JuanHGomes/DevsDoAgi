package Polimofismo.Overloading.Ex2;

public class CarrinhoDeCompras {

    public double calcularValorCompra(double preco1, double preco2){
        return preco1+preco2;
    }

    public double calcularValorCompra(double preco1, double preco2, double desconto){
        return (preco1+preco2)*(1-(desconto/100));
    }
    public double calcularValorCompra(double... precos){
        double soma = 0;
        for(double preco : precos){
            soma += preco;
        }
       return soma;
    }
}
