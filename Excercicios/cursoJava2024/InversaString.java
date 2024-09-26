package cursoJava2024;

import java.util.Scanner;

public class InversaString {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
				
				System.out.print("Digite uma palavra: ");
				String palavra = scanner.nextLine();
				
				String palavraInvertida = new StringBuilder(palavra).reverse().toString();
				
				System.out.println("A palavra invertida é: "+ palavraInvertida);
				
				scanner.close();
	}
}
