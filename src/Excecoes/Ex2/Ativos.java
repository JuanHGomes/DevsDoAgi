package Excecoes.Ex2;


public class Ativos {

    public static double mediaMovel(double[] precos, int dia) throws IllegalArgumentException{

        if(precos.length < 3){
            throw new IllegalArgumentException("É necessário pelo menos 3 valores!");
        }

        return (precos[dia]+precos[dia-1]+precos[dia-2])/3;
    }
}
