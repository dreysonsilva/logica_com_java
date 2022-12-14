package br.com.logica_com_java.calculadora;

import javax.swing.JOptionPane;

public class CompararDoisNumerosMaiorEntre {

	public static void main(String[] args) {
		/*26) Escreva um algoritmo que leia dois números inteiros e compare-os, mostrando
			  na tela uma das mensagens abaixo:
			  - O primeiro valor é o maior
		 	  - O segundo valor é o maior
			  - Não existe valor maior, os dois são iguais
		 */
		
		int n1 = Integer.parseInt(JOptionPane.showInputDialog("Informe primeiro numero"));
		int n2 = Integer.parseInt(JOptionPane.showInputDialog("Informe segundo numero"));;
		
		if(n1>n2) {
			JOptionPane.showMessageDialog(null,"O primeiro valor é o maior");
		}else if(n2>n1) {
			JOptionPane.showMessageDialog(null,"O segundo valor é o maior");
		}else {
			JOptionPane.showMessageDialog(null,"Não existe valor maior, os dois são iguais");
		}
	}
}