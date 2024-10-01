package ContaBancariaAbstrata;


public class ContaCorrente extends ContaBancaria {
    private double taxaManutencao;

    public ContaCorrente(String numeroConta, double saldoInicial, double taxaManutencao) {
        super(numeroConta, saldoInicial);
        this.taxaManutencao = taxaManutencao;
    }

    @Override
    public double calcularTarifa() {
        return taxaManutencao;
    }
}
