package exerciciodecisao;

import java.util.Scanner;

public class Exercicio09 {
   public static void main (String[] args){
       Scanner ler = new Scanner (System.in);
       System.out.println("Digite um numero");
       int num1 = ler.nextInt();
       
       System.out.println("Digite 2º numero");
       int num2 = ler.nextInt();
       
       System.out.println("Digite 3º numero");
       int num3 = ler.nextInt();
       
       
       if (num1 > num2 & num1 > 3 & num2 > num3){
           System.out.println(num1 + "\n" + num2 + "\n" + num3);
           
       }
       
   }
}
