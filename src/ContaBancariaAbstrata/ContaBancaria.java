package ContaBancariaAbstrata;

public abstract class ContaBancaria {
    protected String numeroConta;
    protected double saldo;

    public ContaBancaria(String numeroConta, double saldoInicial) {
        this.numeroConta = numeroConta;
        this.saldo = saldoInicial;
    }

    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Depósito de R$" + valor + " realizado na conta " + numeroConta);
    }

    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado na conta " + numeroConta);
        } else {
            System.out.println("Saldo insuficiente na conta " + numeroConta);
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public abstract double calcularTarifa();
}
