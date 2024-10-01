package ContaBancaria;

public class ContaBancaria {
    protected String numeroConta;
    protected double saldo;
    protected Cliente cliente;
    protected Emprestimo emprestimo;

    public ContaBancaria(String numeroConta, double saldoInicial, Cliente cliente) {
        this.numeroConta = numeroConta;
        this.saldo = saldoInicial;
        this.cliente = cliente;
    }

    public ContaBancaria(String numeroConta, double saldoInicial) {
    }

    public void depositar(double valor) {
        saldo += valor;
        System.out.println(cliente.getNome() + " depositou R$" + valor);
    }

    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            System.out.println(cliente.getNome() + " sacou R$" + valor);
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    public void contratarEmprestimo(Emprestimo emprestimo) {
        this.emprestimo = emprestimo;
        System.out.println("Empréstimo de R$" + emprestimo.getValorEmprestimo() + " contratado.");
    }

    public void mostrarDividaEmprestimo() {
        if (emprestimo != null) {
            System.out.println("Dívida total do empréstimo: R$" + emprestimo.calcularDivida());
        } else {
            System.out.println("Nenhum empréstimo contratado.");
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }
}
