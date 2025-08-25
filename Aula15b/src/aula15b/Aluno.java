/* Essa é uma classe específica (subclasse) que será usada
 * para criar objetos do ytipo Aluno. Essa classe herda 
 * atributos e métodos da classe Pessoa (superclasse)
 */
package aula15b;

/**
 *
 * @author sn1085640
 */
public class Aluno extends Pessoa{
    
    String matricula;
    String curso;
    
    // Construtor
    public Aluno (String nome, String cpf, 
            String matricula, String curso) {
        super(nome, cpf); //Chama o construtor de Pessoa
        this.matricula = matricula;
        this.curso = curso;
    }
    
    public void pagarMensalidade(boolean pago){
        if (pago) {
            System.out.println("O aluno "+ this.nome +
                    ", esta com a mensalidade em dia.");
        } else {
            System.out.println("O aluno "+ this.nome +
                    ", nao esta com a mensalidade em dia.");
        }
    }
    
    @Override
    public void exibirInformacoes(){
        super.exibirInformacoes();
        System.out.println("Matricula: " + this.matricula);
        System.out.println("Curso: " + this.curso);
        System.out.println("=".repeat(30) + "\n");
    }
    
}
