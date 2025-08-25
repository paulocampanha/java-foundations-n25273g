/* Nesse programa vamos criar um método não estático e instânciar
 * um objeto da mesma classe.
 */
package aula09b;

/**
 *
 * @author sn1085640
 */
public class Aula09b {

    public String parOuImpar(int numero){
        
        if (numero % 2 == 0) {
            return "PAR";
        } else {
            return "ÍMPAR";
        }
    }
    
    public static void main(String[] args) {
        Aula09b verificador = new Aula09b(); 
        
        System.out.println("10 é " + verificador.parOuImpar(10));
        System.out.println("13 é " + verificador.parOuImpar(13));
        
    }
    
}
