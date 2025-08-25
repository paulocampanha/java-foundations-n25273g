/* Nessa classe vamos instanciar os objetos do tipo Retangulo e Circulo
 */
package aula18b;

/**
 *
 * @author sn1085640
 */
public class Main {
    
    public static void main(String[] args){
        FormaGeometrica retangulo = new Retangulo(10, 5);
        FormaGeometrica circulo = new Circulo(7);
        
        System.out.println("Area do Retangulo: " + retangulo.calcularArea());
        System.out.println("Perimetro do Retangulo: " + 
                retangulo.calcularPerimetro());
        
        System.out.println("Area do Circulo: " + 
                String.format("%.2f", circulo.calcularArea()));
        System.out.println("Perimetro do Circulo: " + 
                String.format("%.2f", circulo.calcularPerimetro()));
        
    }
    
}
