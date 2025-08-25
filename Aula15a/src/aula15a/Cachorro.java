/* Essa classe herda os atributos e métodos da classe
 * animal e implementa seus prórpios atributos e métodos
 */
package aula15a;

/**
 *
 * @author sn1085640
 */
public class Cachorro extends Animal{
    
    // Atributos específicos de cachorro
    String raca;
    
    // Construtor da subclasse
    public Cachorro(String nome, int idade, String raca){
        // Chama o construtor da superclasse (Animal
        super(nome, idade);
        this.raca = raca;
        System.out.println("Cachorro criado com sucesso.");        
    }
    
    public void latir(){
        System.out.println(this.nome + " esta latindo! Au! Au! Au!");
    }
    
    //Sobrescrevendo o método exibirInfoAnimal para incluir a raça
    @Override // Boa prática para indicar que o método está sendo sobrescrito
    public void exibirInfoAnimal(){
        super.exibirInfoAnimal(); // Chama o método da superclasse para exibir o nome e a idade
        System.out.println("Raca: " + raca);
    }
}
