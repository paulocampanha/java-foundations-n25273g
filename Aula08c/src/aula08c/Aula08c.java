/* Nesse programa vamos explorar a conversão de String para numeros
 * usando os metódos parse*()
 */
package aula08c;

/**
 *
 * @author sn1085640
 */
public class Aula08c {

    public static void main(String[] args) {
        String strInt = "123";
        int valor1 = Integer.parseInt(strInt);
        double valor2 = Double.parseDouble(strInt);
        long valor3 = Long.parseLong(strInt);
        float valor4 = Float.parseFloat(strInt);
        
        System.out.println("strInt: " + strInt);
        System.out.println("Valor1: " + valor1);
        System.out.println("Valor2: " + valor2);
        System.out.println("Valor3: " + valor3);
        System.out.println("Valor4: " + valor4);
        
        String texto = "abc";
        int num = Integer.parseInt(texto);
        
    }
    
}
