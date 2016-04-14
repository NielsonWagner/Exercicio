
package exercicio;

import java.util.Scanner;
import java.lang.Math;

public class Exercicio11 {
    public static void main (String [] args){
        Scanner ler = new Scanner (System.in);
        System.out.println("Digite dois numeros inteiros: ");
        System.out.println("Digite um número real");
        
        double a = ler.nextDouble();
        double b = ler.nextDouble ();
        double c = ler.nextDouble();
        
        double questao1 = 2 * a + b / 2;
        double questao2 = (3 * a) + c;
        double questao3 = Math.pow (c, 3);
        System.out.println ("O produto do 1º com a metade do 2º é: " + questao1);
        System.out.println ("A soma do tripo do 1º com o 3º é: " + questao2);
        
        
        
    }
}
