package ClassesEObjetos.Ex3;

public class Aluno {
    public String nome;
    public double nota1;
    public double nota2;
    private double media;

    double calcularMedia(){
        this.media = (nota1+nota2)/2;
        return media;
    }
    public String verificarSituacao(){
        if(this.media >= 7) return "Aprovado";
        if(this.media >= 5 && this.media <=6) return "Recuperação";
        else return "Reprovado";
    }
    public void exibirRelatorio(){
        System.out.println(this.nome);
        System.out.println(String.valueOf("Primeira nota: " + this.nota1));
        System.out.println(String.valueOf("Segunda nota: " + this.nota2));
        System.out.println(String.valueOf("Média: " + calcularMedia()));
        System.out.println(verificarSituacao());

    }
}
