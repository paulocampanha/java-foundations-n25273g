/* Nessa classe vamos criar os objetos do tipo Aluno,
 * Professor e Pessoa.
 */
package aula15b;

/**
 *
 * @author sn1085640
 */
public class Main {
    
    public static void main(String[] args){
        
        System.out.println("*** Criando Alunos, "
                + "Professores e Pessoas ***");
        Aluno novoAluno = new Aluno("Gaspar", "123.456.789-00",
                                    "20250801", "Java Foundation");
        
        novoAluno.pagarMensalidade(true);
        novoAluno.exibirInformacoes();
    }
}
