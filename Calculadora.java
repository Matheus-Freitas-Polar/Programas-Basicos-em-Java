import java.util.Scanner;
class Calculadora{
  public static void main(String[] args){
  	int x = 0;
  	int y = 0;
  	int codigo = 0;

  	Scanner numero = new Scanner(System.in);

  	System.out.println("Digite um numero inteiro para X: \n");
  	x = numero.nextInt();
  	System.out.println("Agora digite outro inteiro para Y: \n");
  	y = numero.nextInt();
  	System.out.println("Insira o codigo para realizar a operacao desejada \n 1.Soma \n 2.Subtracao \n 3.Multiplicacao \n 4.Divisao.");
  	codigo = numero.nextInt();

  	switch (codigo){

  		case 1:
  		System.out.println(x+y);
  		System.out.println("Seu valor e esse ↑");
  		break;

  		case 2: 
  		System.out.println(x-y);
  		System.out.println("Seu valor e esse ↑");
  		break;

  		case 3: 
  		System.out.println(x*y);
  		System.out.println("Seu valor e esse ↑");
  		break;

  		case 4: 
  		System.out.println(x/y);
  		System.out.println("Seu valor e esse ↑");
  		break;

  		default:
  		System.out.println("Favor digitar um valor inteiro");
  }	}  
}