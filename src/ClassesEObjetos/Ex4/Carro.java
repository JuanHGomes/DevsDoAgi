package ClassesEObjetos.Ex4;

public class Carro {
    public String modelo;
    public double consumoPorKm;
    public double distancia;

    public double calcularConsumo(){
        double litros = this.distancia/this.consumoPorKm;
        return litros;
    }
    public void exibirDados(){
        System.out.println(this.modelo);
        System.out.println("Distância a ser percorrida: "+this.distancia);
        System.out.println("Consumo por KM: "+ this.consumoPorKm);
        System.out.println("Litros de gasolina necessários: "+ calcularConsumo());
    }
}
