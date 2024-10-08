package cursoJava2024;

import java.util.Scanner;

public class MediaAluno {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//Solicitar a nota dos 4 bimestres
		System.out.println("Digite a nota do 1 bimestre: ");
		double nota1 = scanner.nextDouble();
		
		System.out.println("Digite a nota do 2 bimestre: ");
		double nota2 = scanner.nextDouble();
		
		System.out.println("Digite a nota do 3 bimestre: ");
		double nota3 = scanner.nextDouble();
		
		System.out.println("Digite a nota do 4 bimestre: ");
		double nota4 = scanner.nextDouble();
		
		//Calcular a media
		double media = (nota1 + nota2 + nota3 + nota4) / 4;
		
		//Verificar se o aluno foi aprovado
		if (media >= 7) {
		
			System.out.println("Parabens! Voce foi aprovado(a).");
		} else {
			System.out.println("Voce foi reprovado(a).");
		}
		
		//Mostrar a media final
		System.out.println("Sua media final é: " + media);
		
		scanner.close();
			
		}
		

	}
