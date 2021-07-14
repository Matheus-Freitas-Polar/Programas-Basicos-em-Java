import java.util.Scanner;
	class Distancia{
	public static void main(String[] args) {

	//Faça um programa que informe a distância em
	//quilômetros de um raio para o observador
	//O observador deve informar o tempo (em segundos)
    //transcorrido entre ver o raio e ouvir o trovão
	//Assuma que a velocidade do som seja 340 m/s

	float segundos;
	float espaco;

	Scanner calluca = new Scanner(System.in);
	System.out.println("insira quanto tempo demorou entre ver a luz do relanpago ate o som do trovao");
	segundos = calluca.nextFloat();
	espaco = (segundos*340)/1000;
	System.out.print("A distancia em que o raio caiu foi de "); 
	System.out.print(espaco); 
	System.out.print(" kilometros");

	
	}
}