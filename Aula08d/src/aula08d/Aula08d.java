/* Nesse programa vamos explorar a conversão de dados do tipo numérico
 * para String. Fazemos isso de duas formar: String.valueOf() ou 
 * concatenação.
 * Para objetos wrapper (Integer, Double, etc) podemos usar o
 * método toString()
 */
package aula08d;

/**
 *
 * @author sn1085640
 */
public class Aula08d {

    public static void main(String[] args) {
        // Concatenação
        int idade = 30;   
        String idadeTexto = "" + idade;
        System.out.println("int para String: " + idadeTexto);
        
        // .valueOf()
        double preco = 199.99;
        String precoTexto = String.valueOf(preco);
        System.out.println("double para String: " + precoTexto);
        
        boolean estaAtivo = true;
        String estaAtivoTexto = String.valueOf(estaAtivo);
        System.out.println("boolean para String: " + estaAtivoTexto);
        
        // toString
        Integer pontuacao = 500;
        String pontuacaoTexto = pontuacao.toString();
        System.out.println("Integer para String: " + pontuacaoTexto);
        
        
    }
    
}
