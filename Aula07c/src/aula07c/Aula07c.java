/* Nesse programa vamos explorar a classe BigInteger. 
 * Variáveis do tipo BigInteger são inteiro com capacidade 
 * infinita de valor.
 */
package aula07c;
import java.math.BigInteger;
/**
 *
 * @author SN1085640
 */
public class Aula07c {

    public static void main(String[] args) {
        BigInteger populacaoSistemaSolar = 
                new BigInteger("80000000000000000000"); 
        System.out.println("População do sistema solar: " +
                populacaoSistemaSolar);
        BigInteger valor1 = 
                new BigInteger("12345678901234567890");
        BigInteger valor2 = 
                new BigInteger("98765432109876543210");
        BigInteger soma = valor1.add(valor2);
        System.out.println("Soma: " + soma);
    }
    
}
