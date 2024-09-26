package cursoJava2024;

import java.util.Scanner;

public class Votar {
 public static void main(String[] args) {
	 //Cria um objeto Scanner para ler a entrada do usuário
	 Scanner scanner = new Scanner(System.in);
	 
	 //Solicita a idade do usuário
	 System.out.print("Digite sua idade: ");
	 int idade = scanner.nextInt();
	 
	 //Verifica a idade e determina a situaçaão do voto
	 if (idade < 16) {
		 System.out.println("Voce e´menor de 16 anos e nao pode votar.");	 
	 } else if (idade >= 16 && idade < 18) {
		 System.out.println("Voce tem entre 16 e 18 anos, O voto é opcional.");
	 } else {
		 System.out.println("Voce é maior de 18 anos e o voto é obrigatorio.");
	 }
	 
	 //Fecha o scanner
	 scanner.close();
	 
	 }
	 
 }

