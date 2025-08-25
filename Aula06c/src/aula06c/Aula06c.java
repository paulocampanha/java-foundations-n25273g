/* Nesse programa vamos explorar os tipos de dados 
 * primitivos em java.
 * Os tipos primitivos em java são: byte, int, long
 * float, double, char e boolean
 * Tipo de dados long.
 */
package aula06c;
import javax.swing.JOptionPane;
import java.text.NumberFormat;
import java.util.Locale;

/**
 *
 * @author sn1085640
 */
public class Aula06c {

    public static void main(String[] args) {
        NumberFormat formatoBrasil = NumberFormat.getInstance();
        long populacaoMundial = 8_000_000_000L;
        long distanciaEstrelas = 9_460_730_472_580_800L; // Distancia em metros (aprox. 1 ano-luz)
        // long pode ser usado em operações que reultem
        // em número grandes
        long segundosEmUmAno = 365L * 24 * 60 * 60;
        JOptionPane.showMessageDialog(null,
                "População mundial: " +
                formatoBrasil.format(populacaoMundial),
                "Tipo de dados long", 1);
        
        JOptionPane.showMessageDialog(null,
                "Distância das estrelas: " +
                formatoBrasil.format(distanciaEstrelas),
                "Tipo de dados long", 1);
        JOptionPane.showMessageDialog(null,
                "Um ano tem " + 
                formatoBrasil.format(segundosEmUmAno) + 
                " segundos", "Tipo de dados long", 1);
        
        long valorMaximo = Long.MAX_VALUE;
        long proximoValorMaximo = valorMaximo + 1;
        
        JOptionPane.showMessageDialog(null,
                "Valor Máximo: " +
                formatoBrasil.format(valorMaximo),
                "Tipo de dados long", 1);
        JOptionPane.showMessageDialog(null,
                "Valor Mínimo: " +
                formatoBrasil.format(proximoValorMaximo),
                "Tipo de dadoslong", 1);
    }
    
}
