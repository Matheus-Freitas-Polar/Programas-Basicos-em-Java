import java.util.Scanner;
class DiferecaIdade{
	public static void main(String[] args) {
		//Escreva um programa em Java com o nome de DiferencaIdade 
		//que peça a sua idade e a idade da sua mãe. Em seguida, 
		//imprima na tela as 3 informações a seguir:
        //- a sua idade
        //- a idade da sua mãe
        //- minha mãe é <anos> mais velha do que eu
		 
		 int idadeEu; 
		 int idadeMae;

		 Scanner tampa = new Scanner(System.in);

		 System.out.println("Digite sua idade: \n");
		 idadeEu = tampa.nextInt();

		 System.out.println("Digite agora a idade da sua Mae: \n");
		 idadeMae = tampa.nextInt();

		 int anos = idadeMae-idadeEu;

		 System.out.println("\nVoce tem "+idadeEu+" anos de idade");
		 System.out.println("E a sua mae tem "+idadeMae+" anos de idade");
		 System.out.println("\nA diferenca de idade de voce e a sua mae sao de "+anos+" anos");
	}
}