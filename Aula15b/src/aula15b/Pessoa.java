/* Essa é uma classe genérica que será herdade pelas
 * classes Aluno e Professor
 */
package aula15b;

/**
 *
 * @author sn1085640
 */
public class Pessoa {
    
    String nome;
    String cpf;
    
    public Pessoa(String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
    }
    
    public void exibirInformacoes(){
        System.out.println("*** Informações ***");
        System.out.println("Nome: " + this.nome);
        System.out.println("CPF: " + this.cpf);
    }
}
