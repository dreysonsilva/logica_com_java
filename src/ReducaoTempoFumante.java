import java.util.Scanner;

public class ReducaoTempoFumante {

	public static void main(String[] args) {
		/*16) [DESAFIO] Escreva um programa para calcular a redu��o do tempo de vida de um
		fumante. Pergunte a quantidade de cigarros fumados por dias e quantos anos ele
		j� fumou. Considere que um fumante perde 10 min de vida a cada cigarro.
		Calcule quantos dias de vida um fumante perder� e exiba o total em dias.*/
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Quantos cigarros fumado por dia?");
		int qtdCigarrosPorDia = scanner.nextInt();
		
		System.out.println("Quanto tempo voc� fuma");
		int qtdAnosTempoFumando = scanner.nextInt();
		
		int mes=12;
		
		
		if(qtdAnosTempoFumando>0) {	
			int redu��oTempoVida = (qtdAnosTempoFumando*mes)*30;
			int convetendoDiasEmHoras = redu��oTempoVida * 24;
			System.out.println("redu��oTempoVida: "+(redu��oTempoVida/24)*60);
			System.out.println("convetendoDiasEmHoras: "+convetendoDiasEmHoras);
		} 
	}
}