/* Nessa programa vamos criar um ArrayList de números
 * inteiros
 */
package aula12c;
import java.util.*;

/**
 *
 * @author sn1085640
 */
public class Aula12c {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        Random numero = new Random();
        System.out.println("***** Numeros da Megasena *****");
        int i = 0;
        while (i < 6) {
            int numeroSorteado = numero.nextInt(1, 60);
            if (numeros.contains(numeroSorteado)){
                continue;
            }
            numeros.add(numeroSorteado);
            i++;
        }
        
        for (int num : numeros){
            System.out.print(num + " ");
        }
    }
    
}
