/* Nesse programa vamos explorar os metódos de conversão implícita
 * de tipos de dados.
 * O compilador do java faz a conversão implícita de tipos de dados
 * automaticamente quando fazer do tipo menor para o maior.
 * A hierarquia dos tipos primitivos inteiros, do menor para o maior, é
 * byte -> short -> int -> long -> float -> double
 */
package aula08a;

/**
 *
 * @author sn1085640
 */
public class Aula08a {

    public static void main(String[] args) {
        byte idade = 30;
        short idade2 = idade;
        int idade3 = idade2;
        long idade4 = idade3;
        float idade5 = idade4;
        double idade6 = idade5;
        
        System.out.println("Idade: " + idade);
        System.out.println("Idade2: " + idade2);
        System.out.println("Idade3: " + idade3);
        System.out.println("Idade4: " + idade4);
        System.out.println("Idade5: " + idade5);
        System.out.println("Idade6: " + idade6);
    }
    
}
