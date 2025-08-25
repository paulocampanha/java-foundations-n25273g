/* Nesse programa vamos explorar os modificadores de
 * acesso (public, private, protected, default) em outros
 * pacotes.
 */
package aula10b;
import metodos.Calculadora;
/**
 *
 * @author sn1085640
 */
public class Aula10b {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Calculadora operacao = new Calculadora();
        
        int numero1 = 27;
        int numero2 = 3;
        
        int soma = operacao.somar(numero1, numero2);
        System.out.println("A soma dos números é " + soma);
        
        
    }
    
}
