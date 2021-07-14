import java.util.Scanner;
	class Dinheiro{
	public static void main(String[] args) {
		//Faça um programa para, a partir de um valor informado
		//em centavos, indicar a menor quantidade de moedas que
        //representa esse valor
    	//- Considere moedas de 1, 5, 10, 25 e 50 centavos, e 1 real
		//Exemplo: para o valor 290 centavos, a menor quantidade de
		//moedas é 2 moedas de 1 real, 1 moeda de 50 centavos, 1
		//moeda de 25 centavos, 1 moeda de 10 centavos e 1 moeda de
		//5 centavos
		
		int cent;

		Scanner horta = new Scanner(System.in);

		System.out.println("Insira um valor em centavos para dar o menor numero de moedas possiveis");
		cent = horta.nextInt();

		if (cent==1){
			System.out.println("A menor quantidade e de 1 moeda de 1 centavos");
		}
		if (cent==5){
			System.out.println("A menor quantidade e de 1 moeda de 5 centavos");
		}
		if (cent==10){
			System.out.println("A menor quantidade e de 1 moeda de 10 centavos");
		}
		if (cent==25){
			System.out.println("A menor quantidade e de 1 moeda de 25 centavos");
		}
		if (cent==50){
			System.out.println("A menor quantidade e de 1 moeda de 50 centavos");
		}
		if (cent==100){
			System.out.println("A menor quantidade e de 1 moeda de 1 real");
		}
		else {
			System.out.println("Insira um valor corespondente arendondado de 1 ate 100 ");
		}
	}
}