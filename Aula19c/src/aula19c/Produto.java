/* Nessa classe vamos continuar usando o encapsulamento
 */
package aula19c;

/**
 *
 * @author sn1085640
 */
public class Produto {

    private String nomeProduto;
    private String categoria;
    private String embalagem;
    private double preco;
    private int estoque;

    /**
     * @return the nomeProduto
     */
    public String getNomeProduto() {
        return nomeProduto;
    }

    /**
     * @param nomeProduto the nomeProduto to set
     */
    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    /**
     * @return the categoria
     */
    public String getCategoria() {
        return categoria;
    }

    /**
     * @param categoria the categoria to set
     */
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    /**
     * @return the embalagem
     */
    public String getEmbalagem() {
        return embalagem;
    }

    /**
     * @param embalagem the embalagem to set
     */
    public void setEmbalagem(String embalagem) {
        this.embalagem = embalagem;
    }

    /**
     * @return the preco
     */
    public double getPreco() {
        return preco;
    }

    /**
     * @param preco the preco to set
     */
    public void setPreco(double preco) {
        if (preco >= 0){
            this.preco = preco;
        } else {
            System.out.println("O preço não pode ser negativo.");
        }
    }

    /**
     * @return the estoque
     */
    public int getEstoque() {
        return estoque;
    }

    /**
     * @param estoque the estoque to set
     */
    public void setEstoque(int estoqueInicial) {
        if (estoqueInicial >= 0){
            this.estoque = estoqueInicial;
        } else {
            System.out.println("O estoque inicial não pode ser negativo.");
        }
    }

    public Produto(String nomeProduto, String categoria, String embalagem, double preco, int estoque) {
        this.setNomeProduto(nomeProduto);
        this.setCategoria(categoria);
        this.setEmbalagem(embalagem);
        this.setPreco(preco);
        this.setEstoque(estoque);
    }
    
    public void exibirDetalhes(){
        System.out.println("Produto: " + this.nomeProduto);
        System.out.println("Categoria: " + this.categoria);
        System.out.println("Embalagem: " + this.embalagem);
        System.out.println("Preco: " + String.format("%.2f", this.preco));
        System.out.println("Estoque: " + this.estoque);
    }

}
