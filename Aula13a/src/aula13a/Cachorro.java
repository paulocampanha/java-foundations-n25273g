/* Essa classe é a planta baixa para criar varios
 * objetos do tipo Cachorro
 */
package aula13a;

/**
 *
 * @author sn1085640
 */
public class Cachorro {
    
    String nome;
    String raca;
    int idade;
    String porte;
    String sexo;
    
    public void latir(){
        System.out.printf("%s está latindo: ", nome);
        System.out.println("Au! Au! Au!");
    }
    
    public void correr(){
        System.out.printf("%s está correndo... %n", nome);        
    }
    
    public void imprimirInformacoes(){
        System.out.println("Nome do cachorro: " + nome);
        System.out.println("Raça do cachorro: " + raca);
        System.out.printf("Idade do cachorro: %d anos.%n", idade);
        System.out.println("Porte do cachorro: " + porte);
        System.out.println("Sexo do cachorro: " + sexo);
    }
}
