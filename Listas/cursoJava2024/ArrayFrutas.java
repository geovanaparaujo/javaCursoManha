package cursoJava2024;

public class ArrayFrutas {
 
    private String nome;
    private String cor;
    private double peso; // em gramas

    // Construtor da classe Fruta:
    public ArrayFrutas(String nome, String cor, double peso) {
        this.nome = nome;
        this.cor = cor;
        this.peso = peso;
    }

    // Métodos para acessar os atributos:
    // Acessando o nome:
    public String getNome() {
        return nome;
    }

    // Acessando a cor:
    public String getCor() {
        return cor;
    }

    // Acessando o peso:
    public double getPeso() {
        return peso; // Corrigido para retornar a variável correta
    }

    // Método para imprimir as informações das frutas:
    public void imprimirInfos() {
        System.out.println("Fruta: " + nome + ", Cor: " + cor + ", Peso: " + peso + " g");
    }

    // Classe principal:
    public static void main(String[] args) {
        // Criação de um array de objetos da classe ArrayFrutas:
        ArrayFrutas[] arrayFrutas = {
            new ArrayFrutas("Maçã", "Vermelha", 150.5),
            new ArrayFrutas("Banana", "Amarela", 125.5),
            new ArrayFrutas("Laranja", "Amarela", 180),
            new ArrayFrutas("Uva", "Verde", 200.5),
            new ArrayFrutas("Manga", "Verde", 2000.5)
        };

        // Exibindo informações de cada fruta:
        System.out.println("Informações sobre frutas:");
        for (ArrayFrutas fruta : arrayFrutas) {
            fruta.imprimirInfos();
        }
    }
}