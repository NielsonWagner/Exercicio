
package exercicio;

import java.util.Scanner;

public class Exercicio4 {
    public static void main (String [] args){
        Scanner input = new Scanner (System.in);
        
        System.out.println("Digite a 1ª nota: ");
        double nota1 = input.nextDouble();
        System.out.println("Digite a 2ª nota: ");
        double nota2 = input.nextDouble();
        System.out.println("Digite a 2ª nota: ");
        double nota3 = input.nextDouble();
        System.out.println("Digite a 3ª nota: ");
        double nota4 = input.nextDouble();
        System.out.println("Digite a 4ª nota: ");
        double media;
        media = (nota1 + nota2 + nota3 + nota4) / 4;
        
        System.out.println("A média foi: " + media);
        
    }
}
