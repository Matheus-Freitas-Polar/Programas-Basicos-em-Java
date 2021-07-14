import java.util.Scanner;
class Comando{
	float tok;

	public double casoUm(){
		return ((tok-32)*5)/9;	
	}
	public double casoDois(){
		return 9*tok/5+32;
	}
}
class Coversor{
	public static void main(String[] args)
{		int codigo = 0;
		Comando algo = new Comando();
		Scanner graus = new Scanner(System.in);

		System.out.println("Digite os uma quantidade de temperatura ou em Celsius ou em Fahrenheit \n");
		algo.tok = graus.nextFloat();
		System.out.println("Voce esta em uma calculadora coversorra de Graus centigrados \n Qual conversao quer? \n 1.de Fahrenheit para Celsius \n 2.de Celsius para Fahrenheit \n");
		codigo = graus.nextInt();

		switch(codigo){
			case 1:
			System.out.println("Sua conversao de Fahrenheit e de");
			System.out.println(+algo.casoUm());
			System.out.println("Graus Celsius");
			break;

			case 2:
			System.out.println("Sua conversao de Celsius e de");
			System.out.println(+algo.casoDois());
			System.out.println("Graus Fahrenheit");
			break;

			default:
			System.out.println("PA* so seu C*");
		}
	}
}