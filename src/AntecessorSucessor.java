

import javax.swing.JOptionPane;

public class AntecessorSucessor {

	public static void main(String[] args) {
	/*	6) Faça um programa que leia um número inteiro e mostre o seu antecessor e seu
		sucessor.
		Ex:
		Digite um número: 9
		O antecessor de 9 é 8
		O sucessor de 9 é 10
	 */
		
		double numero = Double.parseDouble(JOptionPane.showInputDialog("Digite um numero: "));
		
		System.out.println("O antecessor de "+numero+" é : "+(numero-1));
		System.out.println("O sucessor de "+(numero++)+" é: "+(numero++));
	}

}
