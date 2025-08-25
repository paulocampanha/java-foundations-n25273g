/* Nessa classe vamos implementar os métodos da classe Funcionario
 */
package aula19a;

/**
 *
 * @author sn1085640
 */
public class Gerente extends Funcionario {
    
    private double bonus;
    
    public Gerente(String nome, double salarioBase, double bonus){
        super(nome, salarioBase);
        this.bonus = bonus;
    }
    
    @Override
    public double calcularSalario(){
        double salario = salarioBase + this.bonus;
        return salario;
    }
    
    
    
}
