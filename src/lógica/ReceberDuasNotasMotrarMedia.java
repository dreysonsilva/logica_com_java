package l�gica;

import javax.swing.JOptionPane;

public class ReceberDuasNotasMotrarMedia {

	public static void main(String[] args) {
	/*
	  5) Fa�a um programa que leia as duas notas de um aluno em uma mat�ria e mostre na tela a sua m�dia na disciplina.
		Ex:
		Nota 1: 4.5
		Nota 2: 8.5
			A m�dia entre 4.5 e 8.5 � igual a 6.5
	 */
		
		double nota1 = Double.parseDouble(JOptionPane.showInputDialog("Informe a primeira nota"));
		double nota2 = Double.parseDouble(JOptionPane.showInputDialog("Informe a segunda nota"));
		
		double media = (nota1+nota2)/2;
		
		JOptionPane.showMessageDialog(null, "A m�dia entre: "+nota1+" e "+nota2+" � igual a "+media);
	

	}

}
