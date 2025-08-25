/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metodos;

/**
 *
 * @author sn1085640
 */
public class Calculadora {
    
    public int somar(int num1, int num2){
        int resultado = num1 + num2;
        return resultado;
    }
    
    private int subtrair(int num1, int num2){
        int resultado = num1 - num2;
        return resultado;
    }
    
    protected int multiplicar(int num1, int num2){
        int resultado = num1 * num2;
        return resultado;
    }
    
    int dividir(int num1, int num2){
        int resultado;
        if (num2 != 0) {
            resultado = num1 / num2;
        } else {
            resultado = 0;
        }
        return resultado;
    }
}
