/* Nesse classe vamos implementar os métodos da interface FormaGeometrica
 */
package aula18b;

/**
 *
 * @author sn1085640
 */
public class Retangulo implements FormaGeometrica {
    
    private double base;
    private double altura;
    
    public Retangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }
    
    @Override
    public double calcularArea(){
        double area = base * altura;
        return area;
    }
    
    @Override
    public double calcularPerimetro(){
        double perimetro = 2 * (base + altura);
        return perimetro;
    }
    
    
}
