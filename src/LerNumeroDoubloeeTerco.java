import java.util.Scanner;

public class LerNumeroDoubloeeTerco {
	public static void main(String[] args) {	
		/*
		 * 7) Crie um algoritmo que leia um n�mero real e mostre na tela o seu dobro e a
				sua ter�a parte.
				Ex:
				Digite um n�mero: 3.5
				O dobro de 3.5 � 7.0
				A ter�a parte de 3.5 � 1.16666
		 * 
		 * */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite um n�mero: ");
		double numero = Double.parseDouble(scan.next());
		
		System.out.println("O dobro de: "+numero+" � : "+(numero*2));
		System.out.println("A ter�a parte de:"+ (numero/3));
	}
}