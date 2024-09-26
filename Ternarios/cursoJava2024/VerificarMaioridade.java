package cursoJava2024;

import java.util.Scanner;

public class VerificarMaioridade {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite sua idade: ");
int idade = scanner.nextInt();
 
  String resultado = (idade >= 18) ? "Maior de idade" : "Menor de idade";
	  
	  System.out.println(resultado);

}
}