/* String não é um tipo primitivo, mas uma classe que 
 * representa uma sequência de caracteres (texto)
 */
package aula07f;

/**
 *
 * @author SN1085640
 */
public class Aula07f {

    public static void main(String[] args) {
        String nomeCompleto = new String("Gaspar Neves");
        String saudacao = "Bem-vindo ao Java!";
        System.out.println("Nome completo: " + nomeCompleto);
        
        // Métodos poderosos da classe String
        // length(): Retorna o número de carcteres na string
        System.out.println("A variável saudação tem " +
                saudacao.length() + " caracteres.");
        String vazia = "";
        
        // isEmpty(): Verifica se a string está vazia e
        // retorna true ou false
        System.out.println("saudacao está vazia: " + 
                saudacao.isEmpty());
        System.out.println("vazia está vazia: " +
                vazia.isEmpty());
        
        String frase = "          Ola, mundo java.          ";
        // trim(): Remove espaços em branco ates e depois do 
        // texto
        System.out.println(frase + saudacao);
        System.out.println(frase.trim() + saudacao);
        
        // toUpperCase() e toLowerCase(): converte para maísculas
        // e minúsculas respectivamente
        System.out.println(saudacao.toUpperCase());
        System.out.println(saudacao.toLowerCase());
        
        // startsWith(prefix) e endsWith(suffix):
        // Verifica se a string começa/termina com um 
        // prefixo/sufixo e retorna verdadeiro ou falso
        System.out.println("Tem 'Bem' no inicia da saudacao: " +
                saudacao.startsWith("Bem"));
        System.out.println("Tem 'va!' no final da saudacao: " +
                saudacao.endsWith("va!"));
        System.out.println("Tem 'Bom' no inicio da saudacao: " +
                saudacao.startsWith("Bom"));
        
        // contains(sequencia): Verifica se a string contem 
        // uma sequência de caracteres retornando true ou false
        System.out.println("saudacao contem 'vindo': " +
                saudacao.contains("vindo"));
        System.out.println("saudacao contem 'python'" +
                saudacao.contains("python"));
        
        // substring(beginIndex): Extrai uma parte do texto
        // substring(beginIndex,endIndex): Extria uma parte do texto
        System.out.println("Parte do texto: " +
                saudacao.substring(4));
        System.out.println("Parte do texto: " +
                saudacao.substring(4,9));
        
        // replace(char old, char new)
        System.out.println(saudacao.replace("!", "?"));
        System.out.println(saudacao.replace("Java", "Python"));
        
        
        
        
    }
    
}
