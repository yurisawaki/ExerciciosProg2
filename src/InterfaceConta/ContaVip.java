package InterfaceConta;

public class ContaVip implements Conta {
    private String numeroConta;
    private double saldo;
    private double limiteSaque;

    public ContaVip(String numeroConta, double saldoInicial, double limiteSaque) {
        this.numeroConta = numeroConta;
        this.saldo = saldoInicial;
        this.limiteSaque = limiteSaque;
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Depósito de R$" + valor + " na conta VIP " + numeroConta);
    }

    @Override
    public void sacar(double valor) {
        if (valor <= saldo + limiteSaque) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " da conta VIP " + numeroConta);
        } else {
            System.out.println("Saldo insuficiente e o limite de saque foi atingido na conta VIP " + numeroConta);
        }
    }

    @Override
    public double verSaldo() {
        return saldo;
    }
}

