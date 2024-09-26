package cursoJava2024;

import java.util.Scanner;

public class DivisivelPor3e5 {
  public static void main(String[] args) {
	  //Criar um objeto Scanner para receber a entrada do usuario
	  Scanner scanner = new Scanner(System.in);
	  
	  //Pedir ao usuário para digitar um numero inteiro
	  System.out.print("Digite um numero inteiro: ");
	  int numero = scanner.nextInt();
	  
	  //Verificar se o numero é divisivel por 3 e por 5
	  if (numero % 3 == 0 && numero % 5 == 0)
	  System.out.print("O numeo é divisivel por 3 e 5.");
  } else {
	  System.out.println("O numero nao e´divisivel por 3 e 5.");
  }
  
  //Fecha o Scanner 
  scanner.close();
  }
}
