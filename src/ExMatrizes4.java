public class ExMatrizes4 {
    //4. Dada uma matriz 2x3 com preços de produtos em 2 lojas, crie um metodo para encontrar o menor preço de cada produto (mínimo por coluna).
    //double[] encontrarMenorPrecoPorProduto(double[][] matriz);
    public static void main(String[] args) {
        double[][] matriz = {{100,99,98},{100,101,99}};
        for(double val : econtrarMenorPrecoPorProduto(matriz)) {
            System.out.println(String.valueOf(val));
        }

    }

    static double[] econtrarMenorPrecoPorProduto(double[][] matriz){
        double[] menorPrecoPorProduto = new double[matriz[0].length];

        for (int m = 0; m < matriz[0].length ; m++) {
             menorPrecoPorProduto[m] = matriz[0][m];
            for (int n = 0; n < matriz.length; n++) {
                if(matriz[n][m] <= menorPrecoPorProduto[m]){
                    menorPrecoPorProduto[m] = matriz[n][m];
                }
            }
        }
        return menorPrecoPorProduto;
        }

    }

