package Entregador;

class EntregadorCarro extends Entregador {
    private double capacidadeDeCarga;
    private GerenciadorCombustivel gerenciadorCombustivel;

    public EntregadorCarro(String nome, double capacidadeDeCarga) {
        super(nome);
        this.capacidadeDeCarga = capacidadeDeCarga;
        this.gerenciadorCombustivel = new GerenciadorCombustivel();
    }

    @Override
    public void calcularDistanciaPercorrida() {
        System.out.println("Entregador de carro percorreu " + getDistanciaPercorrida() + " km.");
    }

    @Override
    public double calcularCapacidadeDeCarga() {
        return capacidadeDeCarga;
    }

    public void abastecer(double litros) {
        gerenciadorCombustivel.abastecer(litros);
    }

    public double getCombustivelRestante() {
        return gerenciadorCombustivel.getCombustivelRestante();
    }
}

