package java2024;

import java.util.Scanner;

public class Taxi {
	
	public static void main(String[] arags) {
		Scanner scanner = new Scanner(System.in);
				
				System.out.print("Digite a quantidade de quilometros rodados: ");
                  double kmRodados = scanner.nextDouble();
                  
                  double taxaFixa = 10.0;
                  double valorPorKm = 2.0;

                  double valorTotal = taxaFixa + (kmRodados * valorPorKm);
                  
                  System.out.printf("O valor total a ser pago é: R$ %.2f%n", valorTotal);

           scanner.close();
           
	}
}