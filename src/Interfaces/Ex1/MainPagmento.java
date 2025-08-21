package Interfaces.Ex1;

public class MainPagmento {
    public static void main(String[] args) {
        PagamentoBoleto pagBoleto = new PagamentoBoleto();
        PagamentoCartao pagCartao = new PagamentoCartao();

        pagCartao.processarPagamento(100);
        pagBoleto.processarPagamento(100);
    }
}
