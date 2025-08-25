/* Essa classe será usada para criar objetos do
 * tipo Livro.
 */
package aula14a;

/**
 *
 * @author sn1085640
 */
public class Livro {
    
    String titulo;
    String autor;
    String editora;
    int numeroPaginas;
    
    // Construtor sem atributos
    public Livro(){
        
    }
    
    // Construtor com alguns atributos
    public Livro(String titulo, String autor){
        this.titulo = titulo;
        this.autor = autor;
    }
    
    // Contrutor com todos os atributos
    public Livro(String titulo, String autor, 
            String editora, int numeroPaginas){
        this.titulo = titulo;
        this.autor = autor;
        this.editora = editora;
        this.numeroPaginas = numeroPaginas;
    }
    
    public  void exibirDetalhes(){
        System.out.println("--- Detalhes do Livro ---");
        System.out.println("Titulo: " + this.titulo);
        System.out.println("Autor: " + this.autor);
        System.out.println("Editora: " + this.editora);
        System.out.println("Paginas: " + this.numeroPaginas);
    }
    
}
