/* Nesse classe vamos vciar atributos privados e usar os metodos getters
 * e setters para definir e imprimir os valos dos atributos privados
 */
package aula20a;

/**
 *
 * @author SN1085640
 */
public class Aluno {
    
    private String nome; 
    private int idade;
    private double nota;
    
    public String getNome(){
        return this.nome;
    }
    
    public void setNome(String novoNome){
        if (novoNome != null && !novoNome.trim().isEmpty() )  {
            this.nome = novoNome;
        } else {
            System.out.println("Erro: o nome não pode ser vazio.");
        }        
    }
    
    public int getIdade(){
        return this.idade;
    }
    
    public void setIdade(int novaIdade){
        if (novaIdade >= 16) {
            this.idade = novaIdade;
        } else {
            System.out.println("Alunos com menos de 16 anos não são aceitos.");
        }
    }
    
    public double getNota(){
        return this.nota;
    }
    
    public void setNota(double novaNota){
        if (novaNota >= 0 && novaNota <= 100) {
            this.nota = novaNota;
        } else {
            System.out.println("Erro: A  nota deve estar entre 0 e 100.");
        }
    }
    
    // Construtor
    public Aluno(String nome, int idade, double nota) {
        this.setNome(nome);
        this.setIdade(idade);
        this.setNota(nota);
    }
       
    
}
