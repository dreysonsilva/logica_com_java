

import javax.swing.JOptionPane;

public class AntecessorSucessor {

	public static void main(String[] args) {
	/*	6) Fa�a um programa que leia um n�mero inteiro e mostre o seu antecessor e seu
		sucessor.
		Ex:
		Digite um n�mero: 9
		O antecessor de 9 � 8
		O sucessor de 9 � 10
	 */
		
		double numero = Double.parseDouble(JOptionPane.showInputDialog("Digite um numero: "));
		
		System.out.println("O antecessor de "+numero+" � : "+(numero-1));
		System.out.println("O sucessor de "+(numero++)+" �: "+(numero++));
	}

}
