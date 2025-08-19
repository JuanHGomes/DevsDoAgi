package Polimofismo.Ex1_2;

public class Main {
    public static void main(String[] args) {
        
    Pagamento pag1 = new Pagamento();
    Pagamento pag2 = new PagamentoPix();
    Pagamento pag3 = new PagamentoCartaoCredito();
    Pagamento[] pagVect = new Pagamento[] {pag1,pag2,pag3};

    for(Pagamento pag : pagVect){
        pag.processarPagamento();
    }
        
    }


}
