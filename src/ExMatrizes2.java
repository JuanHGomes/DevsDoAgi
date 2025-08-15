public class ExMatrizes2 {
    //Dada uma matriz 3x4 que representa dívidas mensais de 3 clientes em 4 meses, crie um metodo para encontrar o maior valor da matriz.
    //double encontrarMaiorValor(double[][] matriz);

    public static void main(String[] args) {
        double[][] matriz = {
                {4,2},
                {3,1}
        };
        System.out.printf("%.2f", encontraMaiorValor(matriz));

    }
    static double encontraMaiorValor(double[][] matriz){
        double maior = 0;
        for(double[] linha : matriz){
            for(double val : linha ){
                if(val > maior) maior = val;
            }
        }
        return maior;
    }

}
