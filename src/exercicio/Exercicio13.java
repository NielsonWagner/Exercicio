
package exercicio;

import java.util.Scanner;

public class Exercicio13 {
    public static void main (String[] args){
        Scanner ler = new Scanner (System.in);
        System.out.println("Digite sua Altura: ");
        double altura = ler.nextDouble();
        
        System.out.println ("Digite seu sexo (m) masculino e (F) feminino: ");
        Scanner gravar = new Scanner (System.in);
        String sexo = gravar.nextLine();
        
        double pesom = (72.7 * altura) - 58;
        double pesof = (61.1 * altura) - 44.7;
        
        if (sexo.equals("m")){
            System.out.println(pesom);
        }
        else if(sexo.equals("f")){
            System.out.print(pesof);
        }
        Scanner pesocerto = new Scanner (System.in);
        System.out.println("Digite seu peso: ");
        double peso = pesocerto.nextDouble();
        
        if (peso == pesom){
            System.out.println("Você está com o peso ideal");
        }else if (peso < pesom){
            System.out.println("Você está abaixo do peso");
        }else{
            System.out.println("Você está acima do peso");
        }
        if (peso == pesof){
            System.out.println("Você está com o peso ideal");
        }else if (peso < pesof){
            System.out.println("Você está abaixo do peso");
        }else{
            System.out.println("Você está acima do peso");
        }
        
            
           
    }
}
