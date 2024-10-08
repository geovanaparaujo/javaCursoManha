package cursoJava2024;

public class CriarVeiculo {

	public static void main(String[] args) {
		Carro carro1 = new Carro("Toyota", "Corolla", 2000 , 4);
		Carro carro2 = new Carro("Chevrolet", "Classic", 2002 , 4);
		Carro carro3 = new Carro("BMW", "M3", 1985 , 4);
		
		//Criando Motos:		
		Moto moto1 = new Moto("Honda" , "CG 125", 2015);
		Moto moto2 = new Moto("Yamaha" , "YBR 125", 2018);
		Moto moto3 = new Moto("Harley-Davidson" ,"Sportster", 2020);
				
		//Exibindo o carro:
		System.out.println("Detalhes do Carro 1");
		carro1.exibirDetalhes();
		System.out.println("Detalhes do Carro 2");
		carro2.exibirDetalhes();
		System.out.println("Detalhes do Carro 3");
		carro3.exibirDetalhes();
		
		 //Exibir a moto:
        System.out.println("Detalhes da Moto 1");
        moto1.exibirDetalhes();
        System.out.println("Detalhes da Moto 2");
        moto2.exibirDetalhes();
        System.out.println("Detalhes da Moto 3");
        moto3.exibirDetalhes();
	}
}
		