package ExercicioRepeticao;

import java.util.Scanner;

public class ExercicioRep03 {
    public static void main (String [] args){
        Scanner ler = new Scanner (System.in);
        System.out.println("Digite seu Nome: ");
        String nome = ler.nextLine();
        
        while (nome.length() < 3){
            System.out.println("Nome Inválido, Digite um novo nome: ");
            nome = ler.nextLine();
        }
        
        System.out.println("Digite seu Idade: ");
        int idade = ler.nextInt();
        
        while (idade > 150){
            System.out.println("Idade Inválido, Digite um nova idade: ");
            idade = ler.nextInt();
    }
        
        System.out.println("Digite seu Salário: ");
        double salario = ler.nextDouble();
        
        while (salario < 0){
            System.out.println("Salário Inválido, Digite um novo salário: ");
            salario = ler.nextDouble();
        }    
        System.out.println("Digite seu Sexo: ");
        String sexo = ler.nextLine();
        
        while (sexo != "F" && sexo != "M"){
            System.out.println("Sexo Inválido, Digite seu Sexo: ");
            sexo = ler.nextLine();
        }
        System.out.println("Digite seu Estado Civil: ");
        String estadocivil = ler.nextLine();
        
        while (estadocivil != "S" && estadocivil != "C" && estadocivil != "V" && estadocivil != "D"){
            System.out.println("Nome Inválido, Digite um nova idade: ");
            estadocivil = ler.nextLine();
    
    }}}
