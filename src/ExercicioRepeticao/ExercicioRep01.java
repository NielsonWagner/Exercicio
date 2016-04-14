package ExercicioRepeticao;

import java.util.Scanner;


public class ExercicioRep01 {
    public static void main (String[] args){
        Scanner ler = new Scanner (System.in);
        System.out.println("Digite um número entre 0 e 10: ");
        int nota = ler.nextInt();
        while (nota < 0 || nota > 10){
            System.out.println("Valor Inválido");           
            System.out.println("Digite um número entre 0 e 10: ");
            nota = ler.nextInt();            
        }
        System.out.println("Número Válido");
    }       
}
