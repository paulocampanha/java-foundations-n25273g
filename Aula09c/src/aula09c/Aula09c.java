/* Nesse programa vamos criar um método sem retorno
 */
package aula09c;
import javax.swing.JOptionPane;
/**
 *
 * @author sn1085640
 */
class Aula09c {

    void saudar(String nome, int hora) {
        String mensagem;
        if (hora >= 5 && hora < 12) {
            mensagem = "Bom dia, ";
        } else if (hora >= 12 && hora < 18) {
            mensagem = "Boa tarde, ";
        } else {
            mensagem = "Boa noite, ";
        }
        JOptionPane.showMessageDialog(null,
                mensagem + nome + "!");
    }
    public static void main(String[] args) {
        Aula09c saudacao = new Aula09c();
        
        String nome = JOptionPane.showInputDialog(null,
                "Digite seu nome: ");
        String horaStr = JOptionPane.showInputDialog(null,
                "Digite a hora cheia: ");
        int hora = Integer.parseInt(horaStr);
        saudacao.saudar(nome, hora);
        
    }
    
}
