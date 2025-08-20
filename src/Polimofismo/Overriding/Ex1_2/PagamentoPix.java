package Polimofismo.Overriding.Ex1_2;

public class PagamentoPix extends Pagamento {
    private String chavePix;

    @Override
    public void processarPagamento(){
        System.out.println("Processando pagamento via Pix");
    }

}
