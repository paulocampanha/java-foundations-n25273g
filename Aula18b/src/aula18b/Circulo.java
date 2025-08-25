/* Nesse classe vamos implementar os métodos da interface 
 * FormaGeometrica
 */
package aula18b;

/**
 *
 * @author sn1085640
 */
public class Circulo implements FormaGeometrica{
   
    private double raio;
    
    public Circulo(double raio){
        this.raio = raio;
        
    }
    
    @Override
    public double calcularArea(){
        double area = Math.PI * (this.raio * this.raio);
        return area;
    }
    
    @Override
    public double calcularPerimetro(){
        double perimetro = 2 * Math.PI * this.raio;
        return perimetro;
    }
}
