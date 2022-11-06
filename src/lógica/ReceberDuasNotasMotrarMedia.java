package lógica;

import javax.swing.JOptionPane;

public class ReceberDuasNotasMotrarMedia {

	public static void main(String[] args) {
	/*
	  5) Faça um programa que leia as duas notas de um aluno em uma matéria e mostre na tela a sua média na disciplina.
		Ex:
		Nota 1: 4.5
		Nota 2: 8.5
			A média entre 4.5 e 8.5 é igual a 6.5
	 */
		
		double nota1 = Double.parseDouble(JOptionPane.showInputDialog("Informe a primeira nota"));
		double nota2 = Double.parseDouble(JOptionPane.showInputDialog("Informe a segunda nota"));
		
		double media = (nota1+nota2)/2;
		
		JOptionPane.showMessageDialog(null, "A média entre: "+nota1+" e "+nota2+" é igual a "+media);
	

	}

}
