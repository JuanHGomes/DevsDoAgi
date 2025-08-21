package Interfaces.Ex1;

public class PagamentoCartao implements IPagamento{

    @Override
    public void processarPagamento(double valor){
        System.out.printf("Pagamento de R$ %.2f realizado via boleto bancário\n", valor);
    }

}
