package cursoJava2024;

import java.util.Scanner;

public class Dirigir {

	public static void main(String[] args) {
		 //Cria um objeto Scanner para ler a entrada do usuário
		 Scanner scanner = new Scanner(System.in);
		 
		 //Solicita a idade do usuário
		 System.out.print("Digite sua idade: ");
		 int idade = scanner.nextInt();
		 
		 //Verifica a idade do usuário
		 if (idade >= 18) {
			 System.out.println("Voce pode dirigir no Brasil.");	 
		 } else {
			 System.out.println("Voce não pode dirigir no Brasil ainda.");
			 
		 }
		 
		 //Fecha o scanner
		 scanner.close();
		 
		 }
		 
	 }


