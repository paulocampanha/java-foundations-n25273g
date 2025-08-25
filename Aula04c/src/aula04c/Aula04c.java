/* Nesse programa vamos solicita dois números para o 
 * usuário e fazer as quatro operações da metemática
*/
package aula04c;
import javax.swing.JOptionPane;
/**
 *
 * @author SN1085640
 */
public class Aula04c {

    public static void main(String[] args) {
        while (true) {
            String num1Texto =JOptionPane.showInputDialog(null,
                    "Digite o primeiro número: ",
                    "Calculadora Simples",
                    JOptionPane.INFORMATION_MESSAGE);
            String num2Texto =JOptionPane.showInputDialog(null,
                    "Digite o segundo número: ",
                    "Calculadora Simples",
                    JOptionPane.INFORMATION_MESSAGE);
            
            try {
                // Converter as Strings para double
                double numero1 = Double.parseDouble(num1Texto);
                double numero2 = Double.parseDouble(num2Texto);
                
                double soma = numero1 + numero2;
                double subtracao = numero1 - numero2;
                double multiplicacao = numero1 * numero2;
                
                //Evita divisão por zero
                if (numero2 != 0){
                    double divisao = numero1 / numero2;
                    JOptionPane.showMessageDialog(null,
                            "Resultado: \n" +
                            "Soma: " + soma + "\n" +
                            "Subtração: " + subtracao + "\n" +
                            "Multiplicação: " + multiplicacao + "\n" +
                            "Divisao: " + divisao,
                            "Calculadora Simples",
                            JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null,
                            "Resultado: \n" +
                            "Soma: " + soma + "\n" +
                            "Subtração: " + subtracao + "\n" +
                            "Multiplicação: " + multiplicacao + "\n" +
                            "Divisao: Divisão por zero",
                            "Calculadora Simples",
                            JOptionPane.INFORMATION_MESSAGE);
                }
                break;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null,
                        "Erro: Por favor, digite apenas números",
                        "Calculaora Simples",
                        JOptionPane.ERROR_MESSAGE);
            } catch (NullPointerException e) {
                // Captura o erro se o usuário clicar em Cancelar
                // ou fechar a janela sem digitar.
                JOptionPane.showMessageDialog(null,
                        "Operação cancelada ou entrada vazia.",
                        "Calculador Simples",
                        JOptionPane.ERROR_MESSAGE);
                break;
            }
            
        }
    }
    
}
