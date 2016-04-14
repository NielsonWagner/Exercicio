package exercicio;

//Faça um programa para uma loja de tintas. 

import java.util.Scanner;

//O programa deverá pedir o tamanho em metros quadrados da área a ser pintada. 
//Considere que a cobertura da tinta é de 1 litro para cada 3 metros quadrados 
//e que a tinta é vendida em latas de 18 litros, que custam R$ 80,00. 
//Informe ao usuário a quantidades de latas de tinta a serem compradas e o preço total.

public class exercicio16 {
    public static void main (String[] args){
        Scanner ler = new Scanner (System.in);
        System.out.println("Digite o tamanho em m² da área a ser pintada: ");
        double area = ler.nextDouble();
    
        double lata = 54;
        double valortinta = 80;
        double quantidade = area / lata;
        double preco = quantidade * valortinta;
        
    System.out.println(quantidade);
    System.out.println(preco);
    }
    
    
    
}
