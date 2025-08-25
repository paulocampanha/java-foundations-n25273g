/* Nesse programa vamos explorar os tipos de dados 
 * primitivos em java.
 * Os tipos primitivos em java são: byte, int, long
 * float, double, char e boolean
 * Tipo de dados byte.
 */
package aula06a;
import javax.swing.JOptionPane;
/**
 *
 * @author sn1085640
 */
public class Aula06a {

    public static void main(String[] args) {
        // Tipo de dado byte
        // Armazena valores de -128 a 127
        byte idade = 30;
        byte temperatura = -5;
        byte luminosidade = 125; // Próximo ao limite
        
        JOptionPane.showMessageDialog(null,
                "Idade da pessoa: " + idade,
                "Tipo de dados byte",1);
        
        byte valor1 = 12;
        byte valor2 = 36;
        byte soma = (byte) (valor1 + valor2); // Usamos o cast byte
        JOptionPane.showMessageDialog(null,
                "A somo de " + valor1 + " com " + 
                valor2 + " resulta em " + soma,
                "Tipo de dados byte", 1);
        
        byte valorMaximo = 127;
        byte proximoValor = (byte) (valorMaximo + 1);  // Isso causará um 'overflow' e resultara em -128
        JOptionPane.showMessageDialog(null, 
                proximoValor,"Tipo de dados byte", 1);
        
        byte valorMinimo = -128;
        byte valorAnterior = (byte)(valorMinimo -1); // Isso causará um 'undeflow' e resultara em 127
        JOptionPane.showMessageDialog(null,
                valorAnterior,"Tipo de dados byte", 1);
        
        
        
        
        
    }
    
}
