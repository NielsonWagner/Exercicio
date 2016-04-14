package ExercicioRepeticao;

import java.util.Scanner;

public class ExercicioRep02 {
    public static void main (String[] args){
        Scanner ler = new Scanner (System.in);
        System.out.println("Digite o Nome do Usuário: ");
        String nome = ler.nextLine();
        System.out.println("Digite o Senha do Usuário: ");
        String senha = ler.nextLine();
        
        while (senha.equals(nome)){
            System.out.println("Login Inválido");
            System.out.println("Digite uma nova senha: ");
            nome = ler.nextLine();
           
        }
        System.out.println("Login Aceito");
        }
            
        }
        
    

