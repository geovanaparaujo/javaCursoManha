package cursoJava2024;

import java.util.Scanner;

public class ConpararNumeros {
	public static void main(String[] args) {
	 
	Scanner scanner = new Scanner(System.in);
	
	System.out.print("Digite o primeiro numero inteiro: ");
	int numero1 = scanner.nextInt();
	
	System.out.print("Digite o segundo numero inteiro: ");
	int numero2 = scanner.nextInt();
	
	if (numero1 > numero2) {
		System.out.println("O primeiro numero(" + numero1 + ")é maior que o segundo numero(" + numero2 + ").");
	} else if (numero2 > numero1) { 
		System.out.println("O segundo numero (" + numero2 + ") é maior que o primeiro numero (" + numero1 + ").");
	} else { 
		System.out.println("Os  dois numeros sao iguias. ");
	}
	
	scanner.close();
	
	}
}
