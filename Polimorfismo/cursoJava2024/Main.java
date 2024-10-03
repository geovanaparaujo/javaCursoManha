package cursoJava2024;

public class Main { 
	
	public static void main(String[] args) {
	//Criação de uma contacom saldo inicial de R$ 1000.00
	ContaBancaria conta = new ContaBancaria(5000);
	
	//Exibir o saldo inicial:
	System.out.println("Saldo inicial: R$ "+ conta.getSaldo());
	
	//Realizando um deposito de R$ 500.00
	conta.depositar(2500);
	System.out.println("Saldo inicial: R$ "+ conta.getSaldo());
	
	}
}