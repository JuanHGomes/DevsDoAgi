package ClassesEObjetos.Ex5;

public class Main {
    public static void main(String[] args) {
        Funcionario func1 = new Funcionario();
        func1.nome = "Juan";
        func1.salarioBruto = 1000;
        func1.descontoIR = 100;
        func1.descontoINSS = 100;
        func1.exibirFolhaDePagamento();
    }
}
