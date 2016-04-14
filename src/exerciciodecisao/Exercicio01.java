package exerciciodecisao;

import java.util.Scanner;

public class Exercicio01 {
    public static void main (String [] args){
        Scanner ler = new Scanner (System.in);
        
        System.out.println("Digite um número: ");
        int num1 = ler.nextInt();
        
        System.out.println("Digite outro número: ");
        int num2 = ler.nextInt();
        
        if (num1 > num2){
            System.out.println("O maior número é: " + num1);
        }
        else if(num1 == num2){
            System.out.println("Os dois números são iguais");
        }
        else {
            System.out.println("O maio número é: " + num2);
        }
    }
    }

