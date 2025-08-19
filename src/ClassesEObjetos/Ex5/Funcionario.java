package ClassesEObjetos.Ex5;

public class Funcionario {
    public String nome;
    public double salarioBruto;
    public double descontoINSS;
    public double descontoIR;

    public double calcularSalarioLiquido(){
        double salarioLiquido = salarioBruto-(descontoIR+descontoINSS);
        return  salarioLiquido;
    }

    public void exibirFolhaDePagamento(){
        System.out.println("Nome: "+ this.nome);
        System.out.println("Salário: "+ this.salarioBruto);
        System.out.println();
        System.out.println("Descontos:");
        System.out.println("INSS: "+ this.descontoINSS);
        System.out.println("IR: "+ this.descontoINSS);
        System.out.println("Líquido a receber: " + calcularSalarioLiquido());
    }
}
