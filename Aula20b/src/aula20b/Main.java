/* Nesse classe vamos implementar os abjetos do tipo curso
 */
package aula20b;

/**
 *
 * @author SN1085640
 */
public class Main {
    
    public static void main(String[] args){
        
        Curso curso1 = new Curso();
        curso1.setNomeCurso("Java");
        curso1.setDuracao(80);
        curso1.setNumeroAlunos(16);
        curso1.setPeriodo("Manha");
        curso1.setProfessor("Gaspar");
        
        System.out.println("Curso: " + curso1.getNomeCurso());
        System.out.println("Duracao do curso: " + 
                curso1.getDuracao() + " horas.");
        System.out.println("Numero de alunos: " + 
                curso1.getNumeroAlunos());
        System.out.println("Periodo: " + curso1.getPeriodo());
        System.out.println("Professor: " + curso1.getProfessor());
    }
}
