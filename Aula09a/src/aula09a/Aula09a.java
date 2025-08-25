/* Nesse programa vamos criar um método publico para calcular a 
 * média de alguns números
 */
package aula09a;
import javax.swing.JOptionPane;
/**
 *
 * @author sn1085640
 */
public class Aula09a {

    public static double calcularMedia(double num1, double num2, double num3){
        double soma = num1 + num2 + num3;
        double media = soma / 3;
        return media;
    }
    
    public static void main(String[] args) {
        
        String n1 = JOptionPane.showInputDialog(null,
                "Digite o 1º número: ",
                "Calculo da Média", 1);
        String n2 = JOptionPane.showInputDialog(null,
                "Digite o 2º número: ",
                "Calculo da Média", 1);
        String n3 = JOptionPane.showInputDialog(null,
                "Digite o 3º número: ",
                "Calculo da Média", 1);
        
        double numero1 = Double.parseDouble(n1);
        double numero2 = Double.parseDouble(n2);
        double numero3 = Double.parseDouble(n3);
        
        double media = calcularMedia(numero1, numero2, numero3);
        
        JOptionPane.showMessageDialog(null,
                "A média dos número é: " + String.format("%.2f",media),
                "Calculo da Média", 1);
        
    }
    
}
