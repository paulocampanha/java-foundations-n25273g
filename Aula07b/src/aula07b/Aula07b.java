/* Nesse programa vamos explorar os tipos de dados 
 * primitivos em java.
 * Os tipos primitivos em java são: byte, short, int, long
 * float, double, char e boolean
 * Tipo de dados short. -32.768 até 32.767

 */
package aula07b;

/**
 *
 * @author SN1085640
 */
public class Aula07b {

    public static void main(String[] args) {
        short idadeAluno = 17;
        short temperatura = 11;
        short quantidadeEstoque = 5000;
        short numeroMaximo = Short.MAX_VALUE;
        short numeroMinimo = Short.MIN_VALUE;
        System.out.println("Idade do aluno: " +
                idadeAluno);
        System.out.println("Número máximo: " +
                numeroMaximo);
        System.out.println("Número mínimo: " +
                numeroMinimo);
    }
    
}
