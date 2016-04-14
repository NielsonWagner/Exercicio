package exerciciodecisao;

import java.util.Scanner;

public class Exercicio05 {
    public static void main (String [] args){
        Scanner ler = new Scanner (System.in);
        System.out.println("Digite a primeira nota do aluno: ");
        double nota1 = ler.nextDouble();
        
        System.out.println("Digite a segunda nota do aluno: ");
        double nota2 = ler.nextDouble();
        
        double media = (nota1+nota2) / 2;
        
        if (media >= 7 & media <= 9.9){
            System.out.println ("O aluno foi aprovado");
        }
        else if (media < 7){
            System.out.println("O aluno está reprovado");
        }
        else if (media == 10){
            System.out.println("O aluno foi Aprovado com Distinção");
    }}
    
}
