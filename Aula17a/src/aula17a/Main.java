/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula17a;

/**
 *
 * @author sn1085640
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Animal urso = new Animal();
        Cachorro cachorro = new Cachorro();
        Gato gato = new Gato();
        
        urso.local = "Florestas";
        
        System.out.println("*** Animal fazendo barulho ***");
        urso.fazerBarulho();
        System.out.println("*** Cachorro fazendo barulho ***");
        cachorro.fazerBarulho();
        System.out.println("*** Gato fazendo barulho ***");
        gato.fazerBarulho();
        
    }
    
}
