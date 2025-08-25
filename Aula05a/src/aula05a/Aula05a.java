/* Nesse programa vamos simular um erro de lógica para
   estudar o Debug do Netbeans e o comando Breakpoint 
*/
package aula05a;

/**
 *
 * @author SN1085640
 */
public class Aula05a {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nome = "Gaspar";
        int idade = 25;
        double salario = 3000.00;
        System.out.println("***** Inicio do Programa *****");
        System.out.println("Salário atual de " + nome +
                ": R$ " + salario);
        if (idade >= 18){
            System.out.println(nome + " é maior de idade e ganhou um aumento de 20%");
            salario = salario + 1.20;
        } else {
            System.out.println(nome + " é menor de idade.");
        }
        System.out.println("Salário final de " + nome +
                ": R$ " + salario);
        System.out.println("***** Fim do Programa *****");
    }
    
}
