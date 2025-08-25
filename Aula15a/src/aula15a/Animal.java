/* Essa classe é uma classe genérica para criar qualquer
 * objeto do tipo animal
 */
package aula15a;

/**
 *
 * @author sn1085640
 */
public class Animal {
    
    // Atributos comuns sa todos os animais
    String nome;
    int idade;
    
    // Construtor da superclasse
    public Animal(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
        System.out.println("Animal criado com sucesso.");
    }
    
    // Método comum a todos os animais
    public void comer(){
        System.out.println("=".repeat(30));
        System.out.println(this.nome + " esta comando");
        System.out.println("=".repeat(30));
    }
    
    public void exibirInfoAnimal() {
        System.out.println("*** Informacoes do animal ***");
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade + " anos.");
        
    }
}
