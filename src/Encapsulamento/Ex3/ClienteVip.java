package Encapsulamento.Ex3;

public class ClienteVip {
    private String nome;
    private String cpf;
    private double limiteDeCredito;

//    O CPF deve ter 11 dígitos (sem caracteres especiais)
//    O limite de crédito deve estar entre R$ 1.000,00 e R$ 100.000,00


    private String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    private String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        if(cpf.length() == 11){
            this.cpf = cpf;
        }
    }

    private double getLimiteDeCredito() {
        return limiteDeCredito;
    }

    public void setLimiteDeCredito(double limiteDeCredito) {
        if(limiteDeCredito >= 1000 && limiteDeCredito <= 100000) {
            this.limiteDeCredito = limiteDeCredito;
        }

    }

    public void exibirCliente(){
        System.out.println("Nome: " + getNome());
        System.out.println("CPF: " + getCpf());
        System.out.println("Lmite de crédtio: " + getLimiteDeCredito());
    }
}
