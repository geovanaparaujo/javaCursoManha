package cursoJava2024;

import java.util.Scanner;

public class CalculadoraDesconto {
     public static void main(String[] args) {
    	 Scanner scanner = new Scanner(System.in);
    	 
    	 System.out.print("Digite o preço original do produto: R$ ");
    	 double precoOriginal = scanner.nextDouble();
    	 
    	 System.out.print("Digite o  percentual de desconto (%): ");
    	 double percentualDesconto = scanner.nextDouble();
    	 
    	 double desconto = precoOriginal *  (percentualDesconto / 100);
    	 
    	 double precoFinal = precoOriginal - desconto;
    	 
    	 System.out.printf("O preço final com o desconto é: R$ %.2f",precoFinal);
    	 
    	 scanner.close();
     }
	
}
