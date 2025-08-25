/* Nesse programa vamos solicitar ao ususário a digitação
 * do nome e idade. Em seguida, vamos verificar se o 
 * usuário digitou um nome válido e uma idade válida. 
*/
package aula04a;
import javax.swing.JOptionPane;

/**
 *
 * @author Paulo
 * Versão: 1.0
 * Data: 24/07/2025
 */
public class Aula04a {

    public static void main(String[] args) {
        
        String nome = JOptionPane.showInputDialog(null,
                                    "Digite seu nome:",
                                    "Cadastro de Pessoas",
                                    JOptionPane.INFORMATION_MESSAGE);
        
        // Verifica se o usuário digitou algo e exibe 
        // uma mensagem
        // 
        //           
        if (nome != null && !nome.trim().isEmpty()){
            JOptionPane.showMessageDialog(null,
                    "Olá, " + nome.trim() + "! Seja bem vindo!",
                    "Cadastro de Pessoas",
                    JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null,
                    "Você não digitou um nome.",
                    "Cadastro de Pessoas",
                    JOptionPane.ERROR_MESSAGE);
        }
        
        String idadeTexto = JOptionPane.showInputDialog(null,
                "Digite sua idade:",
                "Cadastro de Pessoas",
                JOptionPane.INFORMATION_MESSAGE);
        
        if (idadeTexto != null && !idadeTexto.trim().isEmpty()){
            try {
                int idade = Integer.parseInt(idadeTexto);
                if (idade >= 18){
                    JOptionPane.showMessageDialog(null,
                            "Por favor, dirija-se ao balcão de cadastro!",
                            "Cadastro de Pessoas",
                            JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null,
                            "Você precisa estar acompanhado com seu responsável",
                            "Cadastro de Pessoas",
                            JOptionPane.ERROR_MESSAGE);
                }
            } catch (NumberFormatException e){
                JOptionPane.showMessageDialog(null,
                        "Idade inválida. Por favor, digite apenas números.",
                        "Cadastro de Pessoas",
                        JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null,
                    "Você não digitou a idade!",
                    "Cadastro de Pessoas",
                    JOptionPane.ERROR_MESSAGE);
        }
    }
    
}
