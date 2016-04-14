package exerciciodecisao;

import java.util.Scanner;

public class Exercicio03 {
    public static void main (String[] args){
    Scanner ler = new Scanner (System.in);
    System.out.println("Digite seu sexo: F-Feminino ou M-Masculino: ");
    String sexo = ler.nextLine();
    
    if (sexo.toUpperCase().equals ("M")){
        System.out.println("O sexo é masculino");        
    }
    else {
        System.out.print("o sexo é feminino");
    }
    
}}
