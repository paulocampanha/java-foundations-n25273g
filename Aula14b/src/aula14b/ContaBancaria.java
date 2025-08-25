/* Essa classe será usada para criar objetos do tipo
 * ContaBancaria. Esse classe também fará a movimentação
 * da conta bancaria do cliente.
 */

package aula14b;

import javax.swing.JOptionPane;

/**
 *
 * @author sn1085640
 */
public class ContaBancaria {
    
    String numeroConta;
    double saldo;
    
    // Construtor
    public ContaBancaria(String numeroConta, double saldo){
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        JOptionPane.showMessageDialog(null,
                "Conta: " + this.numeroConta + 
                "\n criada com saldo inicial de R$ " +
                String.format("%.2f", this.saldo),
                "Banco Senai S/A", 1);
    }
    
    public void depositar(double valor){
        if (valor > 0){
            this.saldo += valor; // saldo = saldo + valor
            JOptionPane.showMessageDialog(null,
                    "Deposito de R$ " + String.format("%.2f", valor) +
                    "\n realizado na conta " + this.numeroConta,
                    "Banco Senai S/A", 1);
            JOptionPane.showMessageDialog(null,
                    "Saldo atual: R$ " + 
                    String.format("%.2f", this.saldo),
                    "Banco Senai S/A", 1);                    
        } else {
            JOptionPane.showMessageDialog(null, 
                    "Valor do deposito inválido.",
                    "Banco Senai S/A", 1);
        }
    }
    
    public void sacar(double valor){
        if (valor > 0){
            if (valor <= this.saldo){
                this.saldo -= valor;
                JOptionPane.showMessageDialog(null,
                        "Saque realizado com sucesso",
                        "Banco Senai S/A", 1);
                JOptionPane.showMessageDialog(null,
                    "Saldo atual: R$ " + 
                    String.format("%.2f", this.saldo),
                    "Banco Senai S/A", 1);            
            } else {
                JOptionPane.showMessageDialog(null,
                        "Saldo insuficiente para o saque.",
                        "Banco Senai S/A", 1);
            }
        } else {
            JOptionPane.showMessageDialog(null,
                    "Valor do saque inválido",
                    "Banco Senai S/A", 1);
        }
    }
}
