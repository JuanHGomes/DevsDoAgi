package ClassesEObjetos.Ex4;

public class Main {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        carro1.modelo = "Honda Civic";
        carro1.distancia = 100.0;
        carro1.consumoPorKm = 10;

        carro1.exibirDados();
    }
}
