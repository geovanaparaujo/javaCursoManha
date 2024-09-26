package cursoJava2024;

import java.util.Scanner;

public class VerificaNumero {
	public static void main(String[] args) {
	//Cria um objeto scanner para receber entrada ao usuário
	Scanner scanner = new Scanner(System.in);
	
	//Solicita ao usuário que insira um numero inteiro
	System.out.print("Digite um numero inteiro: ");
	int numero = scanner.nextInt();
	
	//Verifica se o numero é positivo, negativo ou zero
	if (numero > 0 ) {
		System.out.println("O numero é positivo.");
	} else if (numero < 0) {
		System.out.println("O numero é negativo.");
	} else {
		System.out.println("O numero é zero.");
	}
	
	//Fecha o scanner 
scanner.close();
	}
}
