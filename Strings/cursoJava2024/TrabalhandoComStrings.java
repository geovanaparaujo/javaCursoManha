package cursoJava2024;

public class TrabalhandoComStrings {

	public static void main(String[] args) {
	
		String  texto = "Bem Vindo ao curso de JAVA";
		String texto2 = "Vamos aprender sobre STRING.";
		
		//1.Comprimento da string: 
		String nome = "Geovana Pereira de Araujo";
		System.out.println("Comprimento da String: "+nome.length());
		
        //2.Concatenar Stings:
		  String textoCompleto = texto + texto2;
		  System.out.println("Texto completo: " + textoCompleto);
		  String nome2 = "Geovana";
		  String sobreNome = " Pereira";
		  System.out.println(nome2 + sobreNome);
		  
		  //3. Converter para MAIUSCULA e minusculas:
		  System.out.println("MAIUSCULAS: "+ texto.toUpperCase());
		  System.out.println("minusculas: " + texto.toLowerCase());
		  
		  //4.Substituir uma parte da String:
		  String novoTexto = texto.replace("JAVA", "Vitoria");
		  System.out.println("Texto apos substituiçao: "+ novoTexto);
		  
		  //5. Buscar por uyma substring:
		  int posicao = texto.indexOf("curso");
		  System.out.println("Posição da palvra 'curso': "+ posicao);
		  
		  //6.Verificar se uma String começa ou termina com 1 substring:
		  System.out.println("Começa com 'Bem': "+ texto.startsWith("Bem"));
		  
		 System.out.println("Termina com 'ruim': "+ texto.endsWith("ruim"));
		 
		 //7. Dividir String:
		 String[] palavras = textoCompleto.split(" ");
		 System.out.println("Palavras no texto complexo:");
		 for ( String palavra : palavras ) {
			 System.out.println(palavra);
		 }
		  
		  //8.Remover espaços em branco:
		 String textoComEspacos = "    Textos com espaços    ";
		 System.out.println("Textos sem espaços: '" + textoComEspacos.trim() + "'");
	}

}
