package cursoJava2024;

import java.util.Scanner;

public class ParOuImpar {
	public static void main(String[] args) {
		//Cria um objeto Scanner para receber a entrada do usuário
		Scanner scanner = new Scanner(System.in);
	
		//Pedir ao usuário para digitar um numero
		System.out.print("Digite um numero inteiro: ");
		int numero = scanner.nextInt();
		
		//Vericar se o numero é par ou ímpar
		if (numero % 2 == 0) {
			System.out.print(" O numero " + numero + " é par.");
		} else {
			System.out.println("O numero " + numero + " é impar.");
		}

		//Fecha o Scanner
		scanner.close();
		
	}
}