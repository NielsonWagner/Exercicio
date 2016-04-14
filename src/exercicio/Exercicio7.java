
package exercicio;

import java.util.Scanner;

public class Exercicio7 {
    public static void main (String[] args){
        Scanner ler = new Scanner (System.in);
        System.out.println("Digite o valor da base do quadrado: ");
        int base = ler.nextInt();
        System.out.println("Digite o valor da altura do quadrado: ");
        int altura = ler.nextInt();
        int area = base * altura;
        System.out.println("O dobro da área é: " + area * 2);
        
        
    }
}
