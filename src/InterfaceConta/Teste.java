package InterfaceConta;

public class Teste {
    public static void main(String[] args) {
        ContaSimples contaSimples = new ContaSimples("12345-6", 1000);
        contaSimples.depositar(500);
        contaSimples.sacar(300);
        System.out.println("Saldo da Conta Simples: R$" + contaSimples.verSaldo());

        ContaVip contaVip = new ContaVip("98765-4", 2000, 1000);
        contaVip.depositar(1000);
        contaVip.sacar(2500);
        System.out.println("Saldo da Conta VIP: R$" + contaVip.verSaldo());
    }
}
