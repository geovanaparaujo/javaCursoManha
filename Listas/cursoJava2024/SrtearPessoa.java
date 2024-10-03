package cursoJava2024;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class SrtearPessoa {
	public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in); 
		ArrayList<String> nomes = new ArrayList<>();
	String nome; //Variavel	para guardar cada nome digitado
	
	System.out.println("Digite os nomes das pessoas [ou 'sair' para encerrar]: ");
	
	while (true) {
		System.out.println("Digite um nome: ");
	nome = sc.nextLine();
	 if (nome.equalsIgnoreCase("sair"))
		 break;
	}
	
	if (!nome.trim().isEmpty()) {
		nomes.add(nome);
	} else {
		System.out.println("Nome invalido, tente novamente!");
	}
	
	
	//Vrificar se existe nomes na lista:
	if (nome.isEmpty() ) {
		System.out.println("Nenhum nome foi inserido!");
	} else {
		// Sorteio:
		Random random = new Random();
		int indiceSorteado = random.nextInt(nomes.size());
		String nomeSorteado = nomes.get(indiceSorteado);

		// Exibe o nome sorteado:
		System.out.println("A pessoa sorteada foi: " + nomeSorteado);
	}

	sc.close();
}
}
	
