package exerciciodecisao;

import java.util.Scanner;

public class Exercicio04 {
    public static void main (String[] args){
        Scanner ler = new Scanner (System.in);
        System.out.println("Digite uma letra:");
        String letra = ler.nextLine();
        
        if(letra.equals ("a") || letra.equals ("e") || letra.equals ("i") || letra.equals ("o") || letra.equals ("u")){
            System.out.println("A letra digitada é Vogal");
        }
        else{
            System.out.println("A letra digitada é Consoante");
        }
        
    }
    
}
