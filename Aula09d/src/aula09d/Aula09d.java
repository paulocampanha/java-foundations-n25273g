/* Nesse programa vamos criar alguns métodos com sobrecarga.
 * A sobecarga de métodos permite criar múltiplos metodos com
 * o mesmo nome na mesma classe, desde que eles tenham
 * diferentes tipos de parâmetros
 */
package aula09d;

/**
 *
 * @author sn1085640
 */
public class Aula09d {

    /**
     * Método para calcular a área do quadrado
     * @param lado - O comprimento do lado do quadrado
     * @return - A área do quadrado
     */
    public double calcularArea(double lado){
        double area = lado * lado;
        return area;
    }
    
    /**
     * Método parea calcular a área do retângulo.
     * @param largura - A largura do retângulo
     * @param altura - A altura do retângulo
     * @return - A área do retângulo
     */
    public double calcularArea(double largura, double altura){
        double area = largura * altura;
        return area;
    }
    
    /**
     * Método para calcular a área do círculo
     * @param raio - O raio do círculo
     * @return - A área do circulo
     */
    public double calcularArea(double raio, String forma){
        if (forma.equalsIgnoreCase("circulo")){
            double area = Math.PI * raio;
            return area;
        } else {
            return 0.0;
        } 
    }
    
    public static void main(String[] args) {
        double ladoQuadrado = 5.0;
        double larguraRetangulo = 4.0;
        double alturaRetangulo = 6.0;
        double raioCirculo = 3.0;
        String forma = "circulo";
        Aula09d calcular = new Aula09d();
        
        System.out.println("Area do quadrado: " + 
                calcular.calcularArea(ladoQuadrado));
        System.out.println("Area do retangulo: " + 
                calcular.calcularArea(larguraRetangulo, alturaRetangulo));
        System.out.println("Area do Circulo: " + 
                calcular.calcularArea(raioCirculo, forma));
        
    }
    
}
