package ContaBancaria;

public class ContaCorrente extends ContaBancaria {
    private double taxaManutencao;

    public ContaCorrente(String numeroConta, double saldoInicial, double taxaManutencao) {
        super(numeroConta, saldoInicial);
        this.taxaManutencao = taxaManutencao;
    }

    public void cobrarTaxaManutencao() {
        saldo -= taxaManutencao;
        System.out.println("Taxa de manutenção de R$" + taxaManutencao + " cobrada.");
    }
}

