/* Nessa classe vamos criar metodos para calculos
 */
package aula10a;

/**
 *
 * @author sn1085640
 */
public class Calculadora {
    
    public double somar(double num1, double num2){
        
        double resultado = num1 + num2;
        return resultado;
    }
    
    private double subtrair(double num1, double num2){
        
        double resultado = num1 - num2;
        return resultado;
    }
    
    protected double multiplicar(double num1, double num2 ){
        
        double resultado = num1 * num2;
        return resultado;
    }
    
    double dividir(double num1, double num2){
        
        double resultado;
        
        if (num2 != 0){
            resultado = num1 / num2;
        } else {
            resultado = 0.0;
        }
        
        return resultado;
    }