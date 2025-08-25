/* Nesse programa vamos explorar os tipos de dados 
 * primitivos em java.
 * Os tipos primitivos em java são: byte, int, long
 * float, double, char e boolean
 * Tipo de dados int.
 */
package aula06b;

import javax.swing.JOptionPane;
import java.text.NumberFormat; // Biblioteca para formatar números
import java.util.Locale;       // Biblioteca para definir o formato dos números pt-br

/**
 *
 * @author paulo
 */
public class Aula06b {

    public static void main(String[] args) {
        NumberFormat formatoBrasil = NumberFormat.getInstance(new Locale("pt","BR"));
        int idade = 30;
        int quantidade = 5325;
        int anoAtual = 2025;
        
        JOptionPane.showMessageDialog(null,
                "Idade do aluno: " + idade,
                "Tipo de dados int", 1);
        
        int proximoAno = anoAtual + 1;
        int valorMaximoInt = Integer.MAX_VALUE;
        JOptionPane.showMessageDialog(null,
                "Valor Máximo do int: " + 
                formatoBrasil.format(valorMaximoInt),
                "Tipo de dados int", 1);
        
        int proximoValor = valorMaximoInt + 1;
        JOptionPane.showMessageDialog(null,
                "Proximo valor: " + 
                formatoBrasil.format(proximoValor),
                "Tipo de dados int", 1);
        
        int numeroGrande = 1_567_321_765;
        JOptionPane.showMessageDialog(null,
                "Valor Gigante: " +
                formatoBrasil.format(numeroGrande),
                "Tipo de dados int", 1);
        
        
        
                
    }
    
}
