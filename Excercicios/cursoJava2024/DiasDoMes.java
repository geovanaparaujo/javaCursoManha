package cursoJava2024;

import java.util.Scanner;

public class DiasDoMes {
  public static void main(String[] args) { 
	  Scanner scanner = new Scanner(System.in);
	  System.out.println("Digite o nome de um mes: ");
	  String mes = scanner.nextLine();
	  switch (mes.toLowerCase()) {
	  case "janeiro":
	  case "março":
	  case "maio":
	  case "julho":
	  case "agosto":
	  case "outubro":
	  case "dezembro":
		  System.out.println(mes + " tem 31 dias.");
		  break;
	  case "abril":
	  case "junho":
	  case "setembro":
	  case "novembro":
		  System.out.println(mes + " tem 30 dias.");
		  break;
	  case "fevereiro":
		  System.out.println(mes = " tem 28 dias (ou 29 em anos bissestos).");
		  break;
		  default:
			  System.out.println("Mes invalido. por favor, digite um mes valido");

	  }
  }
}