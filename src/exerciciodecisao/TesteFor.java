package exerciciodecisao;

public class TesteFor {
    
    public static void main(String[] args){
  // laço for que conta de 0 até 10 e soma todos os valores
  
  // variável int que gardará a soma dos valores
  int soma = 0;  
    
  for(int i = 0; i <= 10; i++){
    // vamos somar mais este valor
    soma = soma + i;

    // poderia também ser
    // soma += i;
  }

  // vamos exibir a soma dos valores
  System.out.println("A soma dos valores de 0 a 10 é: " + soma);
}

    
    
    
}
