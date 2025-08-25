/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula13c;

/**
 *
 * @author sn1085640
 */
public class Main {
    
    public static void main(String[] args){
        
        Aluno aluno1 = new Aluno("Gaspar", 8.5);
        Aluno aluno2 = new Aluno("Luiza", 5.0);
        Aluno aluno3 = new Aluno("Jorge", 7.0);
        
        System.out.println("***** Status dos alunos *****");
        aluno1.exibirStatus();
        System.out.println("=".repeat(30));
        aluno2.exibirStatus();
        System.out.println("=".repeat(30));
        aluno3.exibirStatus();
        System.out.println("=".repeat(30));
        
        
        
    }
}
