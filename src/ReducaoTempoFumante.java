import java.util.Scanner;

public class ReducaoTempoFumante {

	public static void main(String[] args) {
		/*16) [DESAFIO] Escreva um programa para calcular a redução do tempo de vida de um
		fumante. Pergunte a quantidade de cigarros fumados por dias e quantos anos ele
		já fumou. Considere que um fumante perde 10 min de vida a cada cigarro. Calcule
		quantos dias de vida um fumante perderá e exiba o total em dias.*/
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Quantos cigarros fumado por dia?");
		int qtdCigarrosPorDia = scanner.nextInt();
		
		System.out.println("Quanto tempo você fuma");
		int qtdAnosTempoFumando = scanner.nextInt();
		
		System.err.println(qtdCigarrosPorDia);
		System.out.println(qtdAnosTempoFumando);

	}

}
