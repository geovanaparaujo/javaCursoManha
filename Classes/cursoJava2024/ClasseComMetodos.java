package cursoJava2024;

public class ClasseComMetodos {
	
	
	//Metodo 01: calcula a soma de dois numeros:
	public int soma( int a, int b ) {
		return a + b;
	}
		
		//Metodo 02: Verificar se 1 numero é par:
		public boolean ehPar(int numero) {
			return numero % 2 == 0;
		}
		
		//Metodo 03:Inverter String:
		public String inverteString(String texto) {
			return new StringBuilder(texto).reverse().toString();
		}
		
		//Metodo 04: Calcula o fatorial de um numero:
		public int fatorial(int numero) {
			if (numero == 0 || numero == 1 ) {
				return 1;
				
			}
			return numero * fatorial(numero - 1 );
		}
		
	
	public static void main(String[] args) {
		//Instanciando a classe:
		ClasseComMetodos utilidades = new ClasseComMetodos();
	
	  //Chamando os metodos:
		System.out.println("A soma de 5 e 3 é: " + utilidades.soma(5, 3));
		
      System.out.println("O numero 17 e´par?: " + utilidades.ehPar(17) );
      
      System.out.println("'Geovana' invertido fica: "+ utilidades.inverteString("Geovana"));
      
      System.out.println("Farorial de 5 é: "+ utilidades.fatorial(5));
	}

}

