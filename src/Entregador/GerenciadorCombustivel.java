package Entregador;

class GerenciadorCombustivel {
    private double combustivelRestante;

    public GerenciadorCombustivel() {
        this.combustivelRestante = 0;
    }

    public void abastecer(double litros) {
        combustivelRestante += litros;
    }

    public double getCombustivelRestante() {
        return combustivelRestante;
    }
}
