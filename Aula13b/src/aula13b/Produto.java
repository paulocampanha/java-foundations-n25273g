/* Essa classe é a planta baixa para criar varios 
 * Objetos do tipo Produto
 */
package aula13b;

/**
 *
 * @author sn1085640
 */
public class Produto {
    
    String nome;
    double preco;
    int estoque;
    
    public void calcularPrecoTotal(int quantidade){
        
        double precoTotal = this.preco * quantidade;
        System.out.printf("%d pacotes de %s = R$ %.2f %n",
                quantidade, this.nome, precoTotal);
    }
    
    public void aumentarEstoque(int valor){
        this.estoque = this.estoque + valor;
        System.out.println("Estoque atual: " + this.estoque);
    }
}
