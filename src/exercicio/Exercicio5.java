
package exercicio;

import java.util.Scanner;

public class Exercicio5 {
    public static void main (String[] args){
        Scanner ler = new Scanner (System.in);
        System.out.print("Digite a metragem do local: ");
        double metro = ler.nextDouble();
        System.out.println("A medida é: " + metro * 100 + "Centrimetros");
    }
}
