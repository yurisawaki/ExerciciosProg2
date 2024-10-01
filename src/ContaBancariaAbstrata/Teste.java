package ContaBancariaAbstrata;


public class Teste {
    public static void main(String[] args) {

        ContaCorrente contaCorrente = new ContaCorrente("12345-6", 1000, 15);
        contaCorrente.depositar(500);
        contaCorrente.sacar(200);
        System.out.println("Tarifa Conta Corrente: R$" + contaCorrente.calcularTarifa());
        System.out.println("Saldo Conta Corrente: R$" + contaCorrente.getSaldo());

        ContaPoupanca contaPoupanca = new ContaPoupanca("65432-1", 2000, 0.02);
        contaPoupanca.depositar(300);
        contaPoupanca.sacar(100);
        contaPoupanca.aplicarRendimento();
        System.out.println("Tarifa Conta Poupança: R$" + contaPoupanca.calcularTarifa());
        System.out.println("Saldo Conta Poupança: R$" + contaPoupanca.getSaldo());

        ContaInvestimento contaInvestimento = new ContaInvestimento("98765-4", 5000, 0.01);
        contaInvestimento.depositar(1000);
        contaInvestimento.sacar(500);
        System.out.println("Tarifa Conta Investimento: R$" + contaInvestimento.calcularTarifa());
        System.out.println("Saldo Conta Investimento: R$" + contaInvestimento.getSaldo());
    }
}

