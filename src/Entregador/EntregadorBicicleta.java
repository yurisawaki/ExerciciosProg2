package Entregador;

class EntregadorBicicleta extends Entregador {
    private double capacidadeDeCarga;

    public EntregadorBicicleta(String nome) {
        super(nome);
        this.capacidadeDeCarga = 10;
    }

    @Override
    public void calcularDistanciaPercorrida() {
        System.out.println("Entregador de bicicleta percorreu " + getDistanciaPercorrida() + " km.");
    }

    @Override
    public double calcularCapacidadeDeCarga() {
        return capacidadeDeCarga;
    }
}

