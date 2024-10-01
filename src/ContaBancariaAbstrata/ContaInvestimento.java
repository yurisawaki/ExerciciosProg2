package ContaBancariaAbstrata;

public class ContaInvestimento extends ContaBancaria {
    private double taxaAdministracao;

    public ContaInvestimento(String numeroConta, double saldoInicial, double taxaAdministracao) {
        super(numeroConta, saldoInicial);
        this.taxaAdministracao = taxaAdministracao;
    }

    @Override
    public double calcularTarifa() {
        return taxaAdministracao * saldo;
    }
}
