/* Essa é uma classe abstrata que possui um método abstrato e
 * um método concreto
 */
package aula18c;

/**
 *
 * @author sn1085640
 */
public abstract class Veiculo {
    
    //Metodo concreto
    public void ligarMotor(){
        System.out.println("O motor foi ligado");
    }
    
    //Método abstrato
    public abstract void acelerar();
    
}
