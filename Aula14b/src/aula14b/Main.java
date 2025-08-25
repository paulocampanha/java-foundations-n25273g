/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula14b;

import javax.swing.JOptionPane;

/**
 *
 * @author sn1085640
 */
public class Main {
    
    public static void main(String[] args){
        
        String numeroConta = JOptionPane.showInputDialog(null,
                "Digite o npumero da conta: ",
                "Banco Senai S/A", 3);
        String saldoInicial = JOptionPane.showInputDialog(null,
                "Digite o saldo inicial da conta: ",
                "Banco Senai S/A", 3);
        double saldo = Double.parseDouble(saldoInicial);
        
        ContaBancaria cb = new ContaBancaria(numeroConta, saldo);
        
        String deposito = JOptionPane.showInputDialog(null,
                "Digite o valor do deposito: ",
                "Banco Senai S/A", 3);
        double valor = Double.parseDouble(deposito);
        cb.depositar(valor);
        
        String saque = JOptionPane.showInputDialog(null,
                "Digite o valor do saque: ",
                "Banco Senai S/A", 3);
        valor = Double.parseDouble(saque);
        cb.sacar(valor);
        
    }
}
