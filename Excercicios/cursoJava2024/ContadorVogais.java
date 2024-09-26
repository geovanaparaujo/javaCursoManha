package cursoJava2024;

import java.util.Scanner;

public class ContadorVogais {

	public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite uma frase: ");
		String frase = scanner.nextLine().toLowerCase();
		
		int contadorVogais = 0;
				for (int i = 0; i < frase.length(); i++) {
					char caractere = frase.charAt(i);
					if ("aeiou".indexOf(caractere) != -1) {
						contadorVogais++;
					}
				}
				
   System.out.println("A frase contém " + contadorVogais + " vogais.");
   
   scanner.close();
   
  
	}
	
}

