/* Nesse classe vamos criar um método concreto e um método
 * abstrato
 */
package aula19a;

/**
 *
 * @author sn1085640
 */
public abstract class Funcionario {
    
    protected String nome;
    protected double salarioBase;
    
    // Construtor
    public Funcionario(String nome, double salarioBase){
        this.nome = nome;
        this.salarioBase = salarioBase;
    }
    
    //Método concreto
    public void exibirDetalhes(){
        System.out.println("=".repeat(30));
        System.out.println("*** Detalhes do Funcionario ***");        
        System.out.println("Nome: " + nome);
        System.out.println("Salario: R$" + salarioBase);
    }
    
    //Método abstrato
    public abstract double calcularSalario();
    
}
