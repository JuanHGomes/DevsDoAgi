package Polimofismo.Overriding.Ex3;

public class Main {
    public static void main(String[] args) {
        Emprestimo emp1 = new EmprestimoPessoal(1000);
        Emprestimo emp2 = new EmprestimoEmpresarial(1000);

        Emprestimo[] empArray = new Emprestimo[]{emp1, emp2};

        int meses = 12;

        for(Emprestimo emp : empArray){
            System.out.printf("Valor do emprestimo R$ %.2f\n", emp.valorEmprestado);
            System.out.printf("Será pago em %dX de %.2f \n",meses, emp.calcularParcela(meses) );


        }
    }
}
