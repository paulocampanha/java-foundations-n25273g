/* Nesse classe vamos implementar um objeto do tipo ContaBancaria
 */
package aula19b;

/**
 *
 * @author sn1085640
 */
public class Main {
    
    public static void main(String[] args){
        
        System.out.println("=".repeat(30));
        System.out.println("--- Sistema de conta bamcaria ---");
        String conta = "12345-6";
        String tipo = "Poupanca";
        double depositoInicial = 1000.00;
        
        ContaBancaria novaConta = new ContaBancaria(conta, tipo, depositoInicial);
        System.out.println("Numero da Conta: " + novaConta.getNumeroConta());
        System.out.println("Tipo da Conta: " + novaConta.getTipoConta());
        System.out.println("Saldo: " + String.format("%.2f", novaConta.getSaldo()));
        
        novaConta.depositar(200.00);
        System.out.println("Saldo: " + String.format("%.2f", novaConta.getSaldo()));
        novaConta.sacar(3000.00);
        System.out.println("Saldo: " + String.format("%.2f", novaConta.getSaldo()));
        novaConta.depositar(-500.00);
        System.out.println("Saldo: " + String.format("%.2f", novaConta.getSaldo()));
        novaConta.depositar(800.00);
        System.out.println("Saldo: " + String.format("%.2f", novaConta.getSaldo()));
        novaConta.sacar(2000.00);
        System.out.println("Saldo: " + String.format("%.2f", novaConta.getSaldo()));
    }
}
