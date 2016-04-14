
package exercicio;

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String [] args){
    Scanner ler = new Scanner (System.in);
    System.out.println ("Digite o valor que ganha por hora: ");
    int hora = ler.nextInt();
    System.out.println ("Quantas horas trabalhou no mês: ");
    int trabalhou = ler.nextInt();
    
    int salario = hora * trabalhou;
    
    System.out.println ("O seu salário é: " + salario);
}
}
