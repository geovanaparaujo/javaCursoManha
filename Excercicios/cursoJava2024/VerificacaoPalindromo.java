package cursoJava2024;

import java.util.Scanner;

public class VerificacaoPalindromo {
   
	public static void main(String[] args) {
		Scanner scanner = new  Scanner(System.in);
		System.out.print("Digite uma palavra: ");
		String palavra = scanner.nextLine().toLowerCase();
		
		palavra = palavra.replaceAll("[^a-zA-Z]", "");
		
		boolean ehPalindromo = palavra.equals(new StringBuilder(palavra).reverse().toString());
		
		if (ehPalindromo) {
			System.out.println("A palavra " + palavra + " é im palindromo!");
		} else {
			System.out.println("A palavra " + palavra + " não é um palindromo.");
		}
		
		scanner.close();
		}
	}

