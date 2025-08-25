/* Essa é uma classe específica (subclasse) que será usada
 * para criar objetos do tipo Professor. Essa classe herda 
 * atributos e métodos da classe Pessoa (superclasse)
 */
package aula15b;

/**
 *
 * @author sn1085640
 */
public class Professor extends Pessoa{
    
    String disciplina;
    double salario;
    
    // Construtor
    public Professor(String nome, String cpf,
            String disciplina, double salario){
        super(nome, cpf); // Chama o construtor de Pessoa
        this.disciplina = disciplina;
        this.salario = salario;
    }
    
    public void darAula(boolean aulaDada){
        if (aulaDada) {
            System.out.println("O professor já deu sua aula.");
        }else {
            System.out.println("O professor ainda não deu sua aula.");
        }
        
    }
    
    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Disciplina: " + this.disciplina);
        System.out.println("Salario: " + this.salario);
        System.out.println("=".repeat(30) + "\n");
    }
    
}
