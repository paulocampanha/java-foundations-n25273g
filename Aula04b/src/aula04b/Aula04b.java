/* Nesse programa vamos trabalhar com uma caixa de dialogo
 * com as opções Yes, No e Calcel
*/
package aula04b;
import javax.swing.JOptionPane;
/**
 *
 * @author SN1085640
 */
public class Aula04b {

    public static void main(String[] args) {
        // Simulando o encerramento do programa
        int resposta = JOptionPane.showConfirmDialog(null,
                "Deseja realmente sair do aplicativo?",
                "Sistema de Pessoas",
                JOptionPane.YES_NO_CANCEL_OPTION);
        
        // Analisando a resposta
        switch (resposta) {
            case JOptionPane.YES_OPTION:
                JOptionPane.showMessageDialog(null,
                        "Saindo do Aplicativo",
                        "Sistema de Pessoas",
                        JOptionPane.INFORMATION_MESSAGE);
                System.exit(0);  // Encerra o programa
            case JOptionPane.NO_OPTION:
                JOptionPane.showMessageDialog(null,
                        "Permanecendo no aplicativo",
                        "Sistema de Pessoas",
                        JOptionPane.INFORMATION_MESSAGE);
                break;
            case JOptionPane.CANCEL_OPTION:
                JOptionPane.showMessageDialog(null,
                        "Operação cancelada pelo usuário.",
                        "Sistema de Pessoas",
                        JOptionPane.INFORMATION_MESSAGE);
                break;
            case JOptionPane.CLOSED_OPTION:
                JOptionPane.showMessageDialog(null,
                        "Janela fechada são seleção.",
                        "Sistema de Pessoas",
                        JOptionPane.INFORMATION_MESSAGE);
                break;
            default:
                break;
        }
    }
    
}
