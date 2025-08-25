/* Nessa classe vamos implementar as Animal, Cachorro
 */
package aula15a;

/**
 *
 * @author sn1085640
 */
public class Main {
    
    public static void main(String[] args){
        
        System.out.println("*** Criando animais ***");
        Animal animal1 = new Animal("Tigre", 5);
        animal1.comer();
        animal1.exibirInfoAnimal();
        System.out.println("*".repeat(30)+ "\n");
        
        Cachorro cachorro1 = new Cachorro("Bruce", 1, "Labrador");
        cachorro1.comer();
        cachorro1.latir();
        cachorro1.exibirInfoAnimal();
        System.out.println("*".repeat(30)+ "\n");
    }
}
