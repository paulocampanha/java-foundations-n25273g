/* Nesse classe vamos implementar os objetos da classe Aluno
 */
package aula20a;

/**
 *
 * @author SN1085640
 */
public class Main {
    
    public static void main(String[] args){
        
        Aluno a1 = new Aluno("Gaspar", 18, 70.0);
        System.out.println("Aluno: " + a1.getNome());
        System.out.println("Idade: " + a1.getIdade());
        System.out.println("Nota: " + a1.getNota());
        
        // Tenta alterar a nota para um valor inválido
        a1.setNota(-30);
        System.out.println("Nota alterada: " + a1.getNota());
        
        // Tenta alterar o nome do aluno para vazio
        a1.setNome("");
        System.out.println("Nome do aluno alterado: " + a1.getNome());
        
        // Tenta alterar a idade do aluno
        a1.setIdade(20);
        System.out.println("Idade alterada: " + a1.getIdade());
    }
}
