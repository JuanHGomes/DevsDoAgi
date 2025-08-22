package ExAplicadoOOP.SistemaFinanceiro;
//Muito bom!
public class ContaPoupanca extends Conta{

    public ContaPoupanca(String numeroConta, String titular) {
        super(numeroConta, titular);
    }

    @Override
    public void aplicarJuros() {
        System.out.println("Juros aplicado!");
        setSaldo(getSaldo()*1.01);
    }
}
