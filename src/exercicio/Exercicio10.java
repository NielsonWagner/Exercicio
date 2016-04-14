
package exercicio;

import java.util.Scanner;

public class Exercicio10 {
    public static void main (String [] args){
    
        Scanner ler = new Scanner (System.in);
    
        System.out.println("Digite a temperatura em Graus Celsius: ");
    
        double temperatura = ler.nextInt();
    
        double f = (temperatura * 1.8) + 32;
    
        System.out.println("A tempratura em Graus Farenheit é: " + f);
    }
}
