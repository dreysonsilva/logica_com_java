import java.util.Scanner;

public class LerAlturaLarguraTitaNecessariaPintarParede {

	public static void main(String[] args) {
		/*
		 * 10) Fa�a um algoritmo que leia a largura e altura de uma parede,
		 *  calcule e mostre a �rea a ser pintada e a
		 *  quantidade de tinta necess�ria para o servi�o,
		 *	sabendo que cada litro de tinta pinta uma �rea de 2metros quadrados 
		 **/
		
		
		//ENTRADA DE DADOS
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Altura?");
		int altura = Integer.parseInt(scanner.next());
		
		System.out.println("Largura?");
		int largura = Integer.parseInt(scanner.next());
		
		
		//PROCESSAMENTO
		int totalAlturaLargura = altura*largura;
		int qtdTintas = 0;
		
		if(totalAlturaLargura % 2==1) {
			qtdTintas = 1;
		}else {
			qtdTintas = 0;
		}
			
		for(int i=1;i<=totalAlturaLargura;i++) {
			if(i%2==0) {
				qtdTintas++;
			}
		}
			
		//SA�DA DE DADOS
		System.out.println("�rea a ser pintada: "+altura*largura);
		System.out.println("Quantidade de tinta necess�ria para o servi�o: "+qtdTintas);
	}

}
