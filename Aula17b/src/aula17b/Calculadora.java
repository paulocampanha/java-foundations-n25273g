/* Polimorfismo por Sobrecarga
 * Nesse caso podemos criar vários métodos com o mesmo nome em uma
 * unica classe, contanto que eles tenham listas de parâmetros
 * diferentes.
 */
package aula17b;

/**
 *
 * @author sn1085640
 */
public class Calculadora {
    
    // Método 1: Soma dois números inteiros
    public int somar(int a, int b){
        int soma = a + b;
        return soma;
    }
    
    // Método 2: Soma três números inteiro
    public int somar(int a, int b, int c) {
        int soma = a + b + c;
        return soma;
    }
    
    // Método 3:Soma dois números decimais (double)
    public double somar(double a, double b){
        double soma = a + b;
        return soma;
    }
    
    public static void main(String[] args){
        
        Calculadora calc = new Calculadora();
        
        // Chamando o Método 1 (int, int)
        int valorSoma = calc.somar(10, 20);
        System.out.println("A soma de 10 + 20 e " + valorSoma);
        
        // Chamando o Método 2 (int, int, int)
        int valorSoma2 = calc.somar(15, 30, 45);
        System.out.println("A soma de 15 + 30 + 45 e " + valorSoma2);
        
        // Chamando o Método 3 (double, double);
        double valorSoma3 = calc.somar(20.5, 40.8);
        System.out.println("A soma de 20.5 + 40.8 e " + valorSoma3);
    }
    
}
