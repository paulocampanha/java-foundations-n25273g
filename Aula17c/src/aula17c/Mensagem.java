/* Nessa classe vamos aplicar o conceito de Polimorfismo por Sobrecarga
 * criando três método com atribus diferentes
 */
package aula17c;

/**
 *
 * @author sn1085640
 */
public class Mensagem {
    
    // Método 1: Recebe uma string e imprime uma mensagem
    public void exibir(String msg){
        System.out.println("Mensagem de Advertência");
        System.out.println(msg);
    }
    
    // Método 2: Recebe uma string e um int e imprime uma mensagem
    public void exibir(String msg, int erro){
        System.out.println("Mensagem de Erro");
        System.out.println(msg);
        System.out.println("Numero do erro: " + erro);
    }
    
    // Método 3: Recebe uma string, um int e outra string e imprime uma mensagem
    public void exibir(String msg, int codigo, String departamento){
        System.out.println("Mensagem de chamado Técnico");
        System.out.println(msg);
        System.out.println("Codigo do chamado: " + codigo);
        System.out.println("Departamento responsavel: " + departamento);
    }
    
    public static void main(String[] args){
        Mensagem mensagem1 = new Mensagem();
        Mensagem mensagem2 = new Mensagem();
        Mensagem mensagem3 = new Mensagem();
        
        mensagem1.exibir("O projetor esta com a exibicao um pouco opaca");
        
        mensagem2.exibir("Usuario sem permissao para acessar a pasta", 238);
        
        mensagem3.exibir("Necessidade de 2 notebooks", 5, "Compras");
    }
}
