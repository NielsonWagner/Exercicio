
package exercicio;

import java.util.Scanner;

public class Exercicio6 {
    public static void main (String[] args){
        Scanner ler = new Scanner (System.in);
        System.out.println("Digite o valor da raio: ");
        double raio = ler.nextDouble();
        double a = 3.14 * raio * raio;
        System.out.println("O valor da Área é: " + a);
    }
    
}
