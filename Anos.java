import java.util.Scanner;
class Anos{
	public static void main(String[] args) {
	int anos;
	int meses;
	int dias;
	int calculo;

	Scanner piro = new Scanner(System.in);
	System.out.println("insira sua idade:\n");
	anos = piro.nextInt();
	System.out.println("Agora os meses:\n");
	meses = piro.nextInt();
	System.out.println("Quantos dias:\n ");
	dias = piro.nextInt();
	calculo = anos*365+meses*30+dias;
	System.out.println("voce tem");
	System.out.println(calculo);
	System.out.println("dias de vida");
	} 
}