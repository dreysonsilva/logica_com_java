package br.com.logica_com_java.calculadora;

import javax.swing.JOptionPane;

public class CompararDoisNumerosMaiorEntre {

	public static void main(String[] args) {
		/*26) Escreva um algoritmo que leia dois n�meros inteiros e compare-os, mostrando
			  na tela uma das mensagens abaixo:
			  - O primeiro valor � o maior
		 	  - O segundo valor � o maior
			  - N�o existe valor maior, os dois s�o iguais
		 */
		
		int n1 = Integer.parseInt(JOptionPane.showInputDialog("Informe primeiro numero"));
		int n2 = Integer.parseInt(JOptionPane.showInputDialog("Informe segundo numero"));;
		
		if(n1>n2) {
			JOptionPane.showMessageDialog(null,"O primeiro valor � o maior");
		}else if(n2>n1) {
			JOptionPane.showMessageDialog(null,"O segundo valor � o maior");
		}else {
			JOptionPane.showMessageDialog(null,"N�o existe valor maior, os dois s�o iguais");
		}
	}
}