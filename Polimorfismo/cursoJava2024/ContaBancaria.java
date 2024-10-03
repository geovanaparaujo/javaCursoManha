package cursoJava2024;

public class ContaBancaria {
	
	// Atributo privado:
	private double saldo;

	// Construtor para inicializar o saldo:
	public ContaBancaria(double saldoInicial) {
		this.saldo = saldoInicial;
	}
	//Metodo publico para depositar dinheiro na conta:
	public void depositar(double valor) {
		if (valor > 0) {
			saldo += valor;
			System.out.println("Deposito realizado com sucesso. Novo saldo: R$ " +saldo);
		} else {
			System.out.println("Valor invalido para deposito");

		}
	}
	
	// Metodo publico para sacar sua GRANA:
	public void sacar(double valor) {
		if (valor > 0 && valor <= saldo) {
			saldo -= valor;
			//saldo = saldo - valor;
			System.out.println("Saque de R$ " + valor + " realizado! ");
		} else {
			System.out.println("Saque inválido. Saldo insuficiente ou valor negativo!");
		}
	}

	// Método publico para consultar o saldo(getter):
	public double getSaldo() {
		return saldo;
		
		
	}
}