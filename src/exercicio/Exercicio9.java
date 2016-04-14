
package exercicio;

import java.util.Scanner;

public class Exercicio9 {
    public static void main (String [] args){
        Scanner ler = new Scanner (System.in);
        System.out.println("Digite a temperatura em Farenheit: ");
        double temperatura = ler.nextDouble();
        double c = (5 * (temperatura - 32) / 9);
        System.out.println ("A temperatura em Graus Celsius é: " + c);
        
        
    }
    
}
