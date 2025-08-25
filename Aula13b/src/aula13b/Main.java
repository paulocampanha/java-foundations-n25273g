/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula13b;

/**
 *
 * @author sn1085640
 */
public class Main {
    
    public static void main(String[] args){
        
        Produto produto1 = new Produto();
    
        produto1.nome = "Macarrão Adria";
        produto1.preco = 9.0;
        produto1.estoque = 50;
        
        produto1.calcularPrecoTotal(10);
        produto1.aumentarEstoque(35);
        
        Produto produto2 = new Produto();
        produto2.nome = "Farinha de Trigo Sol";
        produto2.preco = 11.20;
        produto2.estoque = 32;
        
        produto2.calcularPrecoTotal(5);
        produto2.aumentarEstoque(120);
                
        
    }
    
}
