/* Nessa classe vamos criar os objetos do tipo Funcionarios e
 * instanciar de acordo com as classe filhas, Gerente e 
 * Desenvolvedor
 */
package aula19a;

/**
 *
 * @author sn1085640
 */
public class Main {
   
    public static void main(String[] args){
        
        Funcionario gerente1 = new Gerente("Gaspar", 5000.00, 1500.00);
        gerente1.exibirDetalhes();
        System.out.println("*** Holerite ***");
        System.out.println("Salario Bruto: " + gerente1.calcularSalario());
        
        Funcionario desenvolvedor1 = new Desenvolvedor("Luiza", 3000.00, 15.0);
        desenvolvedor1.exibirDetalhes();
        System.out.println("*** Holerite ***");
        System.out.println("Salario Bruto: R$ " + desenvolvedor1.calcularSalario());
        
    }
}
