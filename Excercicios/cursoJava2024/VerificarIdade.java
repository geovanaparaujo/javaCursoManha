package cursoJava2024;

import java.util.Scanner;

public class VerificarIdade {
  public static void main(String[] args) {
	  //Criar um objeto Scanner para receber a entrada do usuario
	  Scanner scanner = new Scanner(System.in);
	 
      // Pedir ao usuário para digitar sua idade
      System.out.print("Digite sua idade: ");
      int idade = scanner.nextInt();
      
      // Verificar se a pessoa é maior de idade
      if (idade >= 18) {
          System.out.println("Você é maior de idade.");
      } else {
          System.out.println("Você é menor de idade.");
      }

      // Fechar o Scanner
      scanner.close();
  }
}
