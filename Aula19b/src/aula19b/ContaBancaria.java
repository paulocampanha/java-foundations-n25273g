/* Nesse classe vamos criar atributos protegidos e utilizar os métodos
 * getters e setters para definir e demonstrar seus valores
 */
package aula19b;

/**
 *
 * @author sn1085640
 */
public class ContaBancaria {
    
    private String numeroConta;
    private double saldo;
    private String tipoConta;
    
    //Construtor
    public ContaBancaria(String numeroConta, String tipoConta, double saldoInicial){
        this.numeroConta = numeroConta;
        this.tipoConta = tipoConta;
        if (saldoInicial >= 0) {
            this.saldo = saldoInicial;
        } else {
            System.out.println("O saldo inicial não pode ser negativo."
                    + "Saldo inicial definido como 0.");
            this.saldo = 0;
        }
    }
    
    // Getter para o número da conta (somente leitur)
    public String getNumeroConta(){
        return numeroConta;
    }
    
    public String getTipoConta(){
        return tipoConta;
    }
    
    public double getSaldo(){
        return saldo;
    }
    
    // Método publico para depositar
    public void depositar(double valor){
        if (valor > 0){
            this.saldo += valor;
            System.out.println("Deposito efeutado com sucesso.");
        } else {
            System.out.println("Valor de deposito inválido.");
        }
    }
    
    //Metodo publico para sacar
    public void sacar(double valor){
        if(valor > 0 && this.saldo >= valor){
            this.saldo -= valor;
            System.out.println("Saque efetuado com sucesso.");
        } else if (valor <= 0){
            System.out.println("Valor do saque inválido.");
        } else {
            System.out.println("Saldo insuficiente para o saque.");
        }
    }
    
    
    
}
