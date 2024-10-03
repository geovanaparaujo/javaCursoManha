package cursoJava2024;

public class ArraySimples {

	public static void main(String[] args) {
	
		//Criando um Array de supermercado(lista de compras):
		String[] mercado = {"Arroz", "Açucar", "Danone", "Café", "Leite"};		
		
		//Exibindo apenas o terceiro numero da lista:
        //System.out.println("Item selecionado:"+ mercado[5]);
		//Todo arry começa com ZERO!
		
		//Exibindo todos os itens do Array:
		
		//Lendo a linha "item < mercado.length": Enquanto item for menor do que o comprimento de itens do array, faça algo!
		
		for ( int i = 0; i < mercado.length; i++ ) {
			System.out.println(mercado[i]);
			
		}
		
	}
	}


