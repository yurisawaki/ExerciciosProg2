package Transporte;

public class Carro implements Transporte {
    @Override
    public void mover() {
        System.out.println("O carro está se movendo pela estrada.");
    }
}
