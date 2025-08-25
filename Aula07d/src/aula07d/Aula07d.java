/* Nesse programa vamos explorar os tipos de dados 
 * primitivos em java.
 * Os tipos primitivos em java são: byte, int, long
 * float, double, char e boolean
 * Tipo de dados boolean
 */
package aula07d;
import javax.swing.JOptionPane;
/**
 *
 * @author SN1085640
 */
public class Aula07d {

    public static void main(String[] args) {
        boolean estaLogado = true;
        boolean temPermissao = false;
        
        if (estaLogado){
            JOptionPane.showMessageDialog(null,
            "O usuário está logado",
            "Tipo de dados boleano", 1);
        } else {
            JOptionPane.showMessageDialog(null,
            "O usuário não está logado",
            "Tipo de dados boleano", 1);
        }
        int idadeAluno = 10;
        boolean eMaiorIdade = (idadeAluno >= 18);
        if (eMaiorIdade){
            JOptionPane.showMessageDialog(null,
                    "O aluno é maior de idade",
                    "Tipo de dados boleano", 1);
        } else {
            JOptionPane.showMessageDialog(null,
                    "O aluno é menor de idade",
                    "Tipo de dados boleano", 1);
        }
    }
    
}
