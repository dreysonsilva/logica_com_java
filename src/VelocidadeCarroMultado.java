import java.util.Scanner;

public class VelocidadeCarroMultado {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
	/*17) Escreva um programa que pergunte a velocidade de um carro. Caso ultrapasse
	  80Km/h, exiba uma mensagem dizendo que o usuário foi multado. Nesse caso, exiba
  	  o valor da multa, cobrando R$5 por cada Km acima da velocidade permitida.
  	  */
		
		Scanner scanner = new Scanner(System.in);		
		
		System.out.println("Informe qual sua velocidade?");
		int velocidade = Integer.parseInt(scanner.nextLine());
		
		if(velocidade> 80) {
			System.out.println("\n------------------------------\n"
			+ "######### DETRAN PE ###########");
			int calcularMultaVelocidade = (velocidade-80)*5;
			System.out.println("o usuário foi multado em: R$ "+ calcularMultaVelocidade +" \nVelocidade: "+velocidade+"km");
		}else {
			System.out.println("DETRAN PE");
			System.out.println("Sua velocidade foi : "+velocidade+"km");
		}
		
		
	}

}
