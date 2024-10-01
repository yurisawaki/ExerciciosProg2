package Transporte;

public class Main {
    public static void main(String[] args) {
        // Criar diferentes tipos de transporte
        Transporte carro = new Carro();
        Transporte bicicleta = new Bicicleta();

        // Simular um dia de transporte
        System.out.println("Simulação de um dia de transporte:");

        carro.mover();
        bicicleta.mover();
    }
}

