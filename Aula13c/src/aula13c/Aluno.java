/* Essa classe é a planta  para criar varios objetos
 * do tipo Aluno.
 */
package aula13c;

/**
 *
 * @author sn1085640
 */
public class Aluno {
    
    String nome;
    double media;
    
    // Construtor
    public Aluno(String nomeAluno, double mediaAluno){
        this.nome = nomeAluno;
        this.media = mediaAluno;
    }
    
    // Método para verificar se o aluno está aprovado
    public boolean estaAprovado(){
        // Assume que a média para aprovação é 7.0 ou mais.
        boolean resultado = this.media >= 7;
        return resultado;
    }
    
    // Método para exibir status do aluno
    public void exibirStatus() {
        System.out.println("Nome: " + nome);
        System.out.println("Média: " + media);
        if (estaAprovado()){
            System.out.println("Status: APROVADO");
        } else {
            System.out.println("Status: REPROVADO");
        }
    }
            
}
