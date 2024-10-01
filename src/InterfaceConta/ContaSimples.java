package InterfaceConta;

public class ContaSimples implements Conta {
    private String numeroConta;
    private double saldo;

    public ContaSimples(String numeroConta, double saldoInicial) {
        this.numeroConta = numeroConta;
        this.saldo = saldoInicial;
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Depósito de R$" + valor + " na conta simples " + numeroConta);
    }

    @Override
    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " da conta simples " + numeroConta);
        } else {
            System.out.println("Saldo insuficiente na conta simples " + numeroConta);
        }
    }

    @Override
    public double verSaldo() {
        return saldo;
    }
}
