/*  Nessa classe vamos implementar os métodos da classe Funcionario
 */
package aula19a;

/**
 *
 * @author sn1085640
 */
public class Desenvolvedor extends Funcionario {
    
    private double horaExtra;
    
    //Construtor
    public Desenvolvedor(String nome, double salarioBase, double horaExtra){
        super(nome, salarioBase);
        this.horaExtra = horaExtra;
    }
    
    @Override
    public double calcularSalario() {
        double salario = salarioBase + (this.horaExtra * 50);
        return salario;
    }
    
}
