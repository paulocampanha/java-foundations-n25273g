/* Nesse programa vamos estudar o breakpoint e debug
 * com um código maior com vetor e um 'for'
 */
package aula05b;

/**
 *
 * @author SN1085640
 */
public class Aula05b {

    public static void main(String[] args) {
        int[] numeros = {10, 5, 20, 3, 15, 8};
        int somaPar = 0;
        int contadorImpares = 0;
        System.out.println("***** Iniciando processamento da lista...");
        for (int i = 0; i < numeros.length; i++) {
            int numeroAtual = numeros[i];
            System.out.println("Processando numero: " + numeroAtual);
            if (numeroAtual % 2 == 0) {
                somaPar += numeroAtual;  // somaPar = somaPar + numeroAtual
                System.out.println(numeroAtual
                        + " e par. Soma parcial de pares: " + somaPar);
            } else { // É impar
                contadorImpares ++;
                System.out.println(numeroAtual
                        + "e impar. Total de impares: " + contadorImpares);
            }
        }
        System.out.println("=".repeat(50));
        System.out.println("--- Resumo Final ---");
        System.out.println("Soma dos numeros pares: " + somaPar);
        System.out.println("Total de numeros impares: " + contadorImpares);
        System.out.println("***** Processamento concluido *****");

    }

}
