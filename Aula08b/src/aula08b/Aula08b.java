/* Nesse programa vamos explorar a conversão explícita.
 * A conversão explícita é necessária quando queremos atribuir um valor 
 * de um tipo 'maior' para um tipo 'menor'. Essa conversão não é 
 * automática e exige o uso do operador de cast() para indicar ao 
 * compilador que será possível a perda de dados ou precisão.
 */
package aula08b;

/**
 *
 * @author sn1085640
 */
public class Aula08b {

    public static void main(String[] args) {
        int valor = 50;
        short valor2 = (short) valor;
        byte valor3 = (byte) valor2;
        
        System.out.println("Valor: " + valor);
        System.out.println("Valor2: " + valor2);
        System.out.println("Valor3: " + valor3);
        
        double valor4 = 999.88;
        float valor5 = (float) valor4;
        int valor6 = (int) valor5;
        
        System.out.println("Valor4: " + valor4);
        System.out.println("Valor5: " + valor5);
        System.out.println("Valor6: " + valor6);
        
    }
    
}
