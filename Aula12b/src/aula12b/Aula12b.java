/* Nesse programa vamos usar os métodos da classe
 * ArrayList. Ela é usada para criar lista mutáveis
 * elementos. Ela é útil quando precisamos armazenar
 * varios itens, mas não sabemos o número exato de 
 * antemão.
 */
package aula12b;
import java.util.ArrayList;

/**
 *
 * @author sn1085640
 */
public class Aula12b {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String> frutas = new ArrayList<>();
        
        // Adionando elementos
        frutas.add("Banana");
        frutas.add("Maca");
        frutas.add("Laranja");
        frutas.add("Uva");
        
        // Imprimindo os alementos
        for (String fruta: frutas){
            System.out.print(fruta + " ");
        }
        
        // Impriminda a fruta na posição 1
        System.out.println();
        System.out.println("Segunda fruta: " + frutas.get(1));
        
        // Adicionando uma fruta no inicio da lista
        frutas.add(0, "Morango");
        for (String fruta : frutas){
            System.out.println(fruta);
        }
        
        // Verificando a existência de um elemento na lista 
        System.out.println("A lista contém 'Laranja'? " + 
                frutas.contains("Laranja"));
        
        // Removendo um elemento da lista
        frutas.remove("Laranja");
        
        // Verificando a existência de um elemento na lista 
        System.out.println("A lista contém 'Laranja'? " + 
                frutas.contains("Laranja"));
        
        
        
        
    }
    
}
