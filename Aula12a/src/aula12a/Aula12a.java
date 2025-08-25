/* Nesse programa vamos relembrar o uso de Array
 */
package aula12a;
import java.util.Scanner;
/**
 *
 * @author sn1085640
 */
public class Aula12a {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double[] notas = {5.5, 6, 7.5, 8};
        for (double nota : notas){
            System.out.println(nota);
        }
        
        String[] alunos = new String[5];
        alunos[0] = "Gaspar";
        alunos[1] = "Jorge";
        alunos[2] = "Luiza";
        alunos[3] = "Anabela";
        alunos[4] = "Mel";
        
        for (int i = 0; i < alunos.length; i++){
            System.out.println("Aluno: " + alunos[i]);
        }
        
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];
        int contador = 0;
        while (contador < numeros.length) {
            System.out.print("Digite um número: ");
            numeros[contador] = sc.nextInt();
            contador += 1;
        }
        
        for (int numero : numeros){
            System.out.print(numero + " ");
        }
                
    }
    
}
