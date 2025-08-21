package Interfaces.Ex1;

public class PagamentoBoleto implements IPagamento{

    @Override
    public void processarPagamento(double valor) {
        System.out.printf("Pagamento de R$ %.2f realizado via cartão de crédito\n", valor);
    }
}
