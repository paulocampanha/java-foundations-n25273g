/* Nesse programa vamos explorar os tipo de dados em java:
 * byte, int, long, float, double, char
 * E o objeto String.
*/
package aula05c;
import javax.swing.JOptionPane;
/**
 *
 * @author SN1085640
 */
public class Aula05c {

    public static void main(String[] args) {
        // Tipo de dados byte: valores entre -128 e 127
        // oO byte ocupa 8 bits (1 byte)
        byte idadePessoa = 30;
        byte temperaturaMinima = 15;
        byte nivelIluminosidade = 120;
        byte idadePessoa2 = 25;
        
        // Para calcular tipos byte é necessário fazer o
        // casting de (byte)
        byte somaIdades = (byte) (idadePessoa + idadePessoa2);
        
        // Tipo de dados int: valores entre -2.147.483.648 
        // e 2.147.483.647
        // O int ocupa 32 bits (8 bytes)
        int idade = 30;
        int safraFeijao = 2000000000;
        int anoAtual = 2025;
        
        int somaIdades2 = idadePessoa + idadePessoa2;
        
        String numeroTexto = JOptionPane.showInputDialog(null,"Digite um número: ");
        int numero = Integer.parseInt(numeroTexto);
        JOptionPane.showMessageDialog(null,"Número digitado: " + numero);
        
        
        
        
        
    }
    
}
