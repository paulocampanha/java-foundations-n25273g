/* Nessa classe vamos executar os métodos das classe Cachorro
 * gato e Pato
 */
package aula18a;

/**
 *
 * @author sn1085640
 */
public class Main {
    
    public static void main(String[] args){
        // Instanciando os objetos das classe
        Animal cachorro = new Cachorro();
        Animal gato = new Gato();
        Animal pato = new Pato();
        
        cachorro.emitirSom();
        gato.emitirSom();
        pato.emitirSom();
        
    }
}
