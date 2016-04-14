
package exercicio;

import java.util.Scanner;

public class Exercicio3 {
    public static void main (String[] args){
        Scanner input = new Scanner (System.in);
        System.out.println("Digite dois números: ");
        int num1, num2, soma;
        num1 = input.nextInt();
        num2 = input.nextInt();
        
        soma = num1 + num2;
        
        System.out.println("A soma dos dois números foi: " + soma);
        
        
    }
}
