package cursoJava2024;

public class CopaDoMundo {
 public static void main(String[] args) {
	 int anoInicial = 1930;
		        int anoAtual = 2023; 

		        System.out.println("Anos das Copas do Mundo:");

		        for (int ano = anoInicial; ano <= anoAtual; ano += 4) {
		            if (ano == 1942 || ano == 1946) {
		                continue; 
		            }
		            System.out.println("Copa do Mundo de " + ano + "!");
		        }
		    }
		}
 
