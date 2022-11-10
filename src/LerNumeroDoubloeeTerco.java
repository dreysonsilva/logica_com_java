import java.util.Scanner;

public class LerNumeroDoubloeeTerco {
	public static void main(String[] args) {	
		/*
		 * 7) Crie um algoritmo que leia um número real e mostre na tela o seu dobro e a
				sua terça parte.
				Ex:
				Digite um número: 3.5
				O dobro de 3.5 é 7.0
				A terça parte de 3.5 é 1.16666
		 * 
		 * */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite um número: ");
		double numero = Double.parseDouble(scan.next());
		
		System.out.println("O dobro de: "+numero+" é : "+(numero*2));
		System.out.println("A terça parte de:"+ (numero/3));
	}
}