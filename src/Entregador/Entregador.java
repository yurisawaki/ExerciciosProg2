package Entregador;

public abstract class Entregador implements EntregadorInterface {
    protected String nome;
    protected double distanciaPercorrida;

    public Entregador(String nome) {
        this.nome = nome;
        this.distanciaPercorrida = 0;
    }

    public String getNome() {
        return nome;
    }

    public double getDistanciaPercorrida() {
        return distanciaPercorrida;
    }

    public void percorrerDistancia(double distancia) {
        this.distanciaPercorrida += distancia;
    }

    public abstract double calcularCapacidadeDeCarga();
}

