/* Nessa classe vamos criar os objetos do tipo Cachorro
 * e implementar a execução do código.
 */
package aula13a;

/**
 *
 * @author sn1085640
 */
public class Main {
    
    public static void main(String[] args){
        
        Cachorro cachorro1 = new Cachorro();
        
        cachorro1.nome = "Bruce";
        cachorro1.raca = "Labrador";
        cachorro1.idade = 1;
        cachorro1.sexo = "Macho";
        cachorro1.porte = "Grande";
        
        cachorro1.latir();
        cachorro1.correr();
        cachorro1.imprimirInformacoes();
        
        Cachorro cachorro2 = new Cachorro();
        
        cachorro2.nome = "Zorro";
        cachorro2.raca = "Indefinida";
        cachorro2.idade = 16;
        cachorro2.sexo = "Macho";
        cachorro2.porte = "Médio";
        
        cachorro2.latir();
        cachorro2.correr();
        cachorro2.imprimirInformacoes();
        
        
    }
}
