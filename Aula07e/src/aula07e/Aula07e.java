/* Nesse programa vamos explorar os tipos de dados 
 * primitivos em java.
 * Os tipos primitivos em java são: byte, int, long
 * float, double, char e boolean
 * Tipo de dados char
 */
package aula07e;

/**
 *
 * @author SN1085640
 */
public class Aula07e {

    public static void main(String[] args) {
        char primeiraLetra = 'A';
        char arroba = '@';
        char novaLinha = '\n';
        char sinalSoma = '+';
        
        System.out.println("Primeira letra: " + 
                primeiraLetra);
        System.out.println(novaLinha +
                "Valor Unicode de 'A': " +
                (int) primeiraLetra);
        
    }
    
}
