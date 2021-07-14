import java.util.Scanner;
class CargadeBateria{
	public static void main(String[] args) {
		int niveldeBateria=0;

		Scanner carga = new Scanner(System.in);

		System.out.println("Digite a carga da sua bateria");
		niveldeBateria = carga.nextnIt();

		if(niveldeBateria==0){
			System.out.println("se fudeu, pede pra alguem um carregador ai");
		}
		else if(niveldeBateria>=5 && niveldeBateria<=15){
			System.out.println("manda logo o nude pra morena e espera ela responder");
		}
		else if(niveldeBateria>=16 && niveldeBateria<=50){
			System.out.println("Fica tranquilo que ainda da pra jogar uma partida de 8 ball pool");
		}
		else{
			System.out.println("Brother vai se fuder nao sei nem porque vc ta perderndo tempo consultando isso, vc tem bateria pra porra");
		}
	}
}