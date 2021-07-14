import java.util.Scanner;
 public class ComparaNumero{
 	public static void main(String[] args) {
 		//Crie uma programa em java com o nome de 
 		//ComparaNumero que receba dois números e indique se são iguais 
 		//ou se são diferentes. Mostre o maior e o menor (nesta sequência)
 	 
 	 int x;
 	 int y;

 	 Scanner leitor = new Scanner(System.in);

 	 System.out.println("Insira um numero para X:\n");
 	 x = leitor.nextInt();
 	 
 	 System.out.println("Agora insira um valor para Y:\n");
 	 y = leitor.nextInt();

 	 if(x==y){
 	 	System.out.print("\nX e Y sao iguais");
 	 }
 	 if(x>y){
 	 	System.out.print("\nX e maior que Y em ordem decrescente fica ");
 	 	System.out.print(" "+x);
 	 	System.out.print(", "+y);
 	 }
 	 if(x<y){
 	 	System.out.print("\nY e maior que X em ordem decerescente fica ");
 	 	System.out.print(" "+y);
 	 	System.out.print(", "+x);
 	 }

 	}
 }