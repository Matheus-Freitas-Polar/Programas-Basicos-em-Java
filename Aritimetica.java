import java.util.Scanner;
public class Aritimetica{
	int n1;
	int n2;

	public int soma(){
		return n1+n2;
	}
	public int subtrai(){
	 	return n1-n2;
	}
	public int multiplicacao(){
		return n1*n2;
	} 	
	public float divisao(){
		return n1/n2;
	}
}
 class TesteAritimetica{
 	public static void main(String[] args) {
 		Aritimetica a = new Aritimetica();
		Scanner scanner = new Scanner(System.in);
		int sinal = 0;

		System.out.println("digite um Numero");
		a.n1 = scanner.nextInt();
		System.out.println("digite outro Numero");
		a.n2 = scanner.nextInt();

		System.out.println("Digite o numero da operaçao desejada \n 1-soma \n 2-subtracao \n 3-multiplicacao \n 4-divisao");
		sinal = scanner.nextInt();
		switch(sinal){
			case 1 :
			System.out.println(a.soma());
			System.out.println("Essa e sua escolha");
			break;
			case 2 :
			System.out.println(a.subtrai());
			System.out.println("Essa e sua escolha");
			break;
			case 3 :
			System.out.println(a.multiplicacao());
			System.out.println("Essa e sua escolha");
			break;
			case 4 :
			System.out.println(a.divisao());
			System.out.println("Essa e sua escolha");
			break;

			default:
			System.out.println("digite um numero inteiro");
		} 			
 	}
 }