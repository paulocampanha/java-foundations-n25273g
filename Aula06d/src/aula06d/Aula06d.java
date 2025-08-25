/* Nesse programa vamos explorar os tipos de dados 
 * primitivos em java.
 * Os tipos primitivos em java são: byte, int, long
 * float, double, char e boolean
 * Tipo de dados float. 7 casas decimais
 */
package aula06d;

import javax.swing.JOptionPane;
import java.text.NumberFormat;
import java.util.Locale;
/**
 *
 * @author sn1085640
 */
public class Aula06d {

    public static void main(String[] args) {
        NumberFormat formato = NumberFormat.getInstance();
        formato.setMinimumFractionDigits(2); // Pelo menos 2 casas decimais
        formato.setMaximumFractionDigits(2); // No máximo 2 casas decimais
        NumberFormat formatoReal = NumberFormat.getCurrencyInstance();
        float temperatura = 25.5f;
        float numeroDecimal = 0.1234567f;
        float precoUnitario = 19.99f;
        // Operações com float
        float mediaNotas = (55.5f + 32.8f + 85.5f) / 3.0f;
        float icms = precoUnitario * 0.18f;
        JOptionPane.showMessageDialog(null,
                "Temperatura: " + 
                formato.format(temperatura),
                "Tipo de dados float", 1);
        JOptionPane.showMessageDialog(null,
                "Número Decimal: " +
                formato.format(numeroDecimal),
                "Tipo de dados float", 1);
        JOptionPane.showMessageDialog(null,
                "Preço Unitário: " +
                formatoReal.format(precoUnitario),
                "Tipo de dados float", 1);
        JOptionPane.showMessageDialog(null,
                "ICMS: " +
                formatoReal.format(icms),
                "Tipo de dado float", 1);
        
    }
    
}
