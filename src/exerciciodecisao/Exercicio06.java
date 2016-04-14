package exerciciodecisao;

import java.util.Scanner;

public class Exercicio06 {
    public static void main (String[] args){
    Scanner ler = new Scanner (System.in);
    System.out.println("Digite 1º número: ");
    int num1 = ler.nextInt();
    
    System.out.println("Digite 2º número: ");
    int num2 = ler.nextInt();
    
    System.out.println("Digite 3º número: ");
    int num3 = ler.nextInt();
    
    if (num1 > num2 & num1 > num3){
        System.out.println("O maior é: " + num1);
    }
    else if (num2 > num1 & num2 > num3){
        System.out.println("O maior é: " + num2);
    }
    else if (num3 > num1 & num3 > num2){
        System.out.println("O maior é: " + num3);
}
}}
