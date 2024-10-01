package Entregador;

public class TesteEntrega {
    public static void main(String[] args) {
        EntregadorBicicleta entregadorBicicleta = new EntregadorBicicleta("João");
        entregadorBicicleta.percorrerDistancia(15);
        entregadorBicicleta.calcularDistanciaPercorrida();
        System.out.println("Capacidade de carga (Bicicleta): " + entregadorBicicleta.calcularCapacidadeDeCarga() + " kg");

        EntregadorCarro entregadorCarro = new EntregadorCarro("Maria", 50);
        entregadorCarro.percorrerDistancia(30);
        entregadorCarro.abastecer(10);
        entregadorCarro.calcularDistanciaPercorrida();
        System.out.println("Capacidade de carga (Carro): " + entregadorCarro.calcularCapacidadeDeCarga() + " kg");
        System.out.println("Combustível restante: " + entregadorCarro.getCombustivelRestante() + " litros");
    }
}