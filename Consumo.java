import java.util.Scanner;
class Consumo{
	public static void main(String[] args) {
		//Seu Marcos é motorista de caminhão e corta todo o país fazendo entregas para transportadoras.
		// Porém, ele está com um problema para calcular o quanto de óleo diesel ele está consumindo e 
		//quantos kilometros seu caminhão está fazendo com 1L de óleo diesel. Sendo assim façam um programa que:
		//- Calcule quanto de diesel o caminhão de Seu Marcos está consumindo por km rodado(mais conhecido como média);
		//- Quanto Marcos está gastando em cada abastecimento, sabendo que o caminhão tem 2 tanques com capacidade de 450L cada;
		//Como Marcos anda o pais todo, cada posto tem um preço de óleo Diesel mas em média é R$3,66.
		
		float kilometros;
		float preco;

		Scanner pneu = new Scanner(System.in);

		System.out.println("Boa tarde seu Marcos. Por gentieza informe quantos kilometros o senhor percoreu ate acabar os seus 2 tanques?");
		kilometros = pneu.nextFloat();
		preco = 900/kilometros;

		System.out.print("\nEntao o senhor gastou R$3294,00 e faz ");
		System.out.print(preco);
		System.out.print(" litros por Km rodado\n");
		System.out.print("\nE gastou R$");
		System.out.print(preco*3.66);
		System.out.print(",00 em diesel\n");
	}
}