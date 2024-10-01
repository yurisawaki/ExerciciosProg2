package ContaBancariaAbstrata;

public class ContaPoupanca extends ContaBancaria {
    private double taxaRendimento;

    public ContaPoupanca(String numeroConta, double saldoInicial, double taxaRendimento) {
        super(numeroConta, saldoInicial);
        this.taxaRendimento = taxaRendimento;
    }

    @Override
    public double calcularTarifa() {
        return 0;
    }

    public void aplicarRendimento() {
        saldo += saldo * taxaRendimento;
        System.out.println("Rendimento aplicado. Saldo atual: R$" + saldo);
    }
}
