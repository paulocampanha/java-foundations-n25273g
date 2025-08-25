/* Nesse programa vamos explorar os tipos de dados 
 * primitivos em java.
 * Os tipos primitivos em java são: byte, int, long
 * float, double, char e boolean
 * Tipo de dados double. 16 casas decimais
 * 1.12345678901234566789
 * 9_007_000_000_000_000_000.9
 */
package aula07a;
import javax.swing.JOptionPane;
import java.text.NumberFormat;
import java.util.Locale;
/**
 *
 * @author SN1085640
 */
public class Aula07a {

    public static void main(String[] args) {
        double salarioMensal = 13555.75;
        double pi = 3.141592653589793;
        double areaCirculo = pi * (5.0 * 5.0); // Raio ao quadrado
        NumberFormat formatoBrasil = NumberFormat.getInstance();
        NumberFormat formatoReal = NumberFormat.getCurrencyInstance();
        double maiorValorPositivo = Double.MAX_VALUE;
        double maiorValorNegativo = -Double.MAX_VALUE;
        double menorValorPositivo = Double.MIN_VALUE;
        System.out.println("Maior valor positivo: " +
                maiorValorPositivo);
        System.out.println("Maior valor negativo: " +
                maiorValorNegativo);
        System.out.println("Menor valor positivo: " +
                menorValorPositivo);
        JOptionPane.showMessageDialog(null,
                "Valor do PI: " + formatoBrasil.format(pi),
                "Tipo de dados double", 1);
        JOptionPane.showMessageDialog(null,
                "Área do Circulo: " + 
                formatoBrasil.format(areaCirculo),
                "Tipo de dados double", 1);
        JOptionPane.showMessageDialog(null,
                "Salário mensal: " + 
                formatoReal.format(salarioMensal),
                "Tipo de dados double", 1);
    }
    
}
