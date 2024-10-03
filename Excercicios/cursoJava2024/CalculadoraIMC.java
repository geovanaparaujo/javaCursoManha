package cursoJava2024;

import java.util.Scanner;

public class CalculadoraIMC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu peso em kg: ");
        double peso = scanner.nextDouble();

        System.out.println("Digite sua altura em metros: ");
        double altura = scanner.nextDouble();

        // Cálculo do IMC
        double imc; // Declaração da variável com ponto e vírgula
        imc = peso / (altura * altura);

        System.out.println("Seu IMC é: " + imc);

        // Classificação do IMC (adaptada para crianças e adolescentes)
        if (imc < 18.5) {
            System.out.println("Abaixo do peso. ");
        } else if (imc >= 18.5 && imc < 25) {
        	System.out.println("Sobrepeso."); 

        } else {
            System.out.println("Obesidade.");

        }
    }
}