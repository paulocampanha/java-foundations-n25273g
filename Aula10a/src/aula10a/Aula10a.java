/* Nesse programa vamos explorar os modificadores
 * public, private, pretected e default.
 */
package aula10a;

/**
 *
 * @author sn1085640
 */
public class Aula10a {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Calculadora operacao = new Calculadora();
                
        double numero1 = 7;
        double numero2 = 29;
        double soma = operacao.somar(numero1, numero2);        
        System.out.println("A soma dos número é " + soma);
        
        
        double multiplicacao = 
                operacao.multiplicar(numero1, numero2);
        System.out.println("A multiplicação dos número é " +
                multiplicacao);
        
        double divisao = operacao.dividir(numero1, numero2);
        System.out.println("A divisão dos número é " +
                divisao);
    }
    
}
