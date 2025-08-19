package Polimofismo.Ex1_2;

public class PagamentoCartaoCredito extends Pagamento{
    private String numeroCartao;

    @Override
    public void processarPagamento(){
        System.out.println("Processando pagamento no cartao");
    }


}
