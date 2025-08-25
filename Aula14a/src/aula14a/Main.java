/* Nessa classe vamos implementar os objetos da classe
 * Livro
 */
package aula14a;
import javax.swing.JOptionPane;
/**
 *
 * @author sn1085640
 */
public class Main {
    
    public static void main(String[] args){
        
        Livro livro1 = new Livro();
        
        livro1.titulo = "1984";
        livro1.autor = "George Orwell";
        livro1.editora = "Companhia da Letras";
        livro1.numeroPaginas = 416;
        
        livro1.exibirDetalhes();
        
        Livro livro2 = new Livro("O avesso da pele", "Jeferson Tenorio");
        livro2.editora = "Companhia das Letras";
        livro2.numeroPaginas = 208;
        livro2.exibirDetalhes();
        
        Livro livro3 = new Livro("O Hobbit", "J.R.R. Tolkien",
            "HarperCollins Brasil", 336);
        
        livro3.exibirDetalhes();
        
        String titulo = JOptionPane.showInputDialog(null,
                "Digite o nome do Livro:",
                "Livraria Senai", 1);
        String autor = JOptionPane.showInputDialog(null,
                "Digite o autor do Livro:",
                "Livraria Senai", 1);
        String editora = JOptionPane.showInputDialog(null,
                "Digite a editora do Livro:",
                "Livraria Senai", 1);
        String paginas = JOptionPane.showInputDialog(null,
                "Digite o número de páginas do Livro:",
                "Livraria Senai", 1);
        int numeroPaginas = Integer.parseInt(paginas);
        
        Livro livro4 = new Livro(titulo, autor, editora, 
                numeroPaginas);
        livro4.exibirDetalhes();
        /*
        Duna
        Frank Herbert
        Aleph
        680
        */
    }
}
