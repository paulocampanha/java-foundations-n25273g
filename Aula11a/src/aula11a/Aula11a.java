/* Nesse programa vamos explorar os métodos da 
 * classe Math
 */
package aula11a;

/**
 *
 * @author SN1085640
 */
public class Aula11a {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Raiz Quadrada
        double numero = 81;
        double raizQuadrada = Math.sqrt(numero);
        System.out.println("A raiz quadrada de " + numero +
                " é igual a " + raizQuadrada);
        
        // Potência
        int base = 9;
        int expoente = 2;
        
        double potencia = Math.pow(base, expoente);
        System.out.println(base + " elevado a " + 
                expoente + " é igual a " + potencia);
        
        // Número aleatório
        double aleatorio = Math.random();
        System.out.println("Numero aleatorio: " + aleatorio);
        
        int num = (int) (aleatorio * 100);
        System.out.println(num);
        
        numero = 9.365;
        // Arredondando número
        System.out.println("Aredondando: " + Math.round(numero));
        System.out.println("Teto do numero: " + Math.ceil(numero));
        System.out.println("Piso do numero: " + Math.floor(numero));
        
        numero = -9.365;
        System.out.println("Valor absoluto: " + Math.abs(numero));
               
                
        
        
    }
    
}
