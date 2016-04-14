package exerciciodecisao;

import java.util.Scanner;

public class Exercicio02 {
    public static void main (String [] args){
    Scanner ler = new Scanner (System.in);
    System.out.println ("Digite um numero: ");
    int num = ler.nextInt();
    
    if (num >= 0){
        System.out.println ("O número digitado é positivo");
        
    }
    else {
        System.out.println("O número digitado é negativo");
    }
    
    
    
        
        
}}
