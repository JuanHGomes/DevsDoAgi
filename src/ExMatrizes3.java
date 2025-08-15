public class ExMatrizes3 {
    //3. Crie um metodo que calcule o total de saldos de uma matriz 3x2 (clientes x meses) e outro metodo que calcule o saldo médio por cliente (média das linhas).
    //double calcularSaldoTotal(double[][] matriz);
    //double[] calcularMediaPorCliente(double[][] matriz);

    public static void main(String[] args) {
        double[][] matriz = {{100,100},{100,100},{100, 100}};
        System.out.printf("%.2f", calcularSaldoTotal(matriz));
        System.out.println();

        double[] mediaPorClientes = calcularMediaPorCliente(matriz);

       for(double val : mediaPorClientes){
           System.out.println(String.valueOf(val));
       }
    }
    static double calcularSaldoTotal(double[][] matriz){
        double totalSaldos = 0;
        for(double[] linhas : matriz ){
            for(double val : linhas){
                totalSaldos += val;
            }
        }
        return totalSaldos;
    }

    static double[] calcularMediaPorCliente(double[][] matriz){
        double[] mediaPorClientes = new double[matriz.length];
        for(int i =0; i < matriz.length; i++){
                double somaVect = 0;
                for(double val : matriz[i]){
                    somaVect += val;
                }
                mediaPorClientes[i] = somaVect/matriz[i].length;
        }
        return mediaPorClientes;
    }

}
