package ContaBancaria;

public class Emprestimo {
    private double valorEmprestimo;
    private double taxaJuros;

    public Emprestimo(double valorEmprestimo, double taxaJuros) {
        this.valorEmprestimo = valorEmprestimo;
        this.taxaJuros = taxaJuros;
    }

    public double calcularDivida() {
        return valorEmprestimo + (valorEmprestimo * taxaJuros);
    }

    public double getValorEmprestimo() {
        return valorEmprestimo;
    }

    public double getTaxaJuros() {
        return taxaJuros;
    }
}
