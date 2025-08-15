import java.util.Arrays;
import java.util.Random;

public class ExMatrizes1 {

    public static void main(String[] args) {
        double[][] matriz = preencherMatriz();
        System.out.println(Arrays.deepToString(matriz));
        System.out.println();
        for (int i = 0; i < matriz.length; i++) { // percorre as linhas
            for (int j = 0; j < matriz[i].length; j++) { // percorre as colunas
                System.out.print(matriz
                        [i][j] + " ");
            }
            System.out.println(); // quebra de linha
        }
        System.out.println();
        System.out.println(String.valueOf(calcularSomaTotal(matriz)));


    }
    //1. Crie um metodo para preencher uma matriz 2x2 com receitas e despesas. Depois, crie um metodo que calcule a soma total de todos os elementos da matriz.
    //void preencherMatriz(double[][] matriz);
    //double calcularSomaTotal(double[][] matriz);

    public static double[][] preencherMatriz(){
        double[][] matriz = new double[2][2];
        Random random = new Random();
       for(int linhas = 0; linhas < matriz.length; linhas++){
           for (int colunas = 0; colunas < matriz[linhas].length; colunas++){
               matriz[linhas][colunas] = random.nextInt(10);
           }
       }
       return matriz;
    }

    static double calcularSomaTotal(double[][] matriz){
        double somaTotal = 0;
        for(int i = 0; i<matriz.length; i++){
            for (int j = 0; j<matriz[i].length; j++){
            somaTotal += matriz[j][i];
            }
        }
        return somaTotal;
    }
}
