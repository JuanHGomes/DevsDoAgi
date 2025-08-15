public class ExVetores {

    public static void main(String[] args) {

    }

    //Crie um programa que:
    //Receba os preços de fechamento de uma ação durante 10 dias.
    //Use os métodos:
    //maiorPreco(double[] precos) → retorna o maior preço.
    //menorPreco(double[] precos) → retorna o menor preço.

    public static double maiorPreco(double[] precos) {
        double maior = precos[0];
        for (double p : precos) {
            if (p > maior) maior = p;
        }
        return maior;
    }

    public static double menorPreco(double[] precos) {
        double menor = precos[0];
        for (double p : precos) {
            if (p < menor) menor = p;
        }
        return menor;
    }

    //2. Variação Percentual de Preços
    //Crie um programa que:
    //Receba um vetor com os preços diários de uma ação durante 5 dias.
    //Use o metodo variacaoDiaria(double[] precos), que retorne um vetor com as variações percentuais diárias.

    public static double[] variacaoDiaria(double[] precos) {
        double[] variacao = new double[precos.length - 1];

        for (int i = 0; i <= precos.length - 2; i++) {
            variacao[i] = ((precos[i + 1] - precos[i]) / precos[i]) * 100;
        }
        return variacao;
    }

    //3. Simulação de Carteira de Ações
    //Crie um programa que:
    //Armazene em um vetor os valores de 5 ações diferentes na carteira de um investidor.
    //Use os métodos:
    //totalInvestido(double[] carteira) → retorna a soma total investida.
    //percentualPorAcao(double[] carteira) → retorna um vetor com o percentual de cada ação na carteira.

    public static double totalInvestido(double[] carteira) {
        double totalInvestido = 0;
        for (double valor : carteira) {
            totalInvestido += valor;
        }
        return totalInvestido;
    }

    public static double[] percentualPorAcao(double[] carteira) {
        double totalCarteira = 0;
        for (double valor : carteira) {
            totalCarteira += valor;
        }
        double[] percentual = new double[carteira.length];
        for (int i = 0; i < carteira.length; i++) {
            percentual[i] = (carteira[i] / totalCarteira) * 100;
        }
        return percentual;
    }

    //4. Cálculo de Imposto sobre Ganhos de Capital
    //Crie um programa que:
    //Receba vetores com os preços de compra e de venda de 5 ativos.
    //Use os métodos:
    //lucroPorAtivo(double[] compra, double[] venda) → retorna um vetor com o lucro ou perda de cada ativo.
    //lucroTotal(double[] compra, double[] venda) → retorna o lucro total.
    //calcularImposto(double lucroTotal) → retorna o imposto devido (0 se não ultrapassar R$ 20.000).

    public static double[] lucroPorAtivo(double[] compra, double[] venda){
return compra;
    }


}


