import javax.swing.JOptionPane;

public class ParOuImpar {

	public static void main(String[] args) {
		/*
		 * 20) Desenvolva um programa que leia um inteiro e motre se ele é par ou ímpar*/
		
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Informe o numero que deseja verificar se par ou ímpar"));
		
		if(numero %2==0) {
			JOptionPane.showMessageDialog(null, "PAR");
		}else {
			JOptionPane.showMessageDialog(null, "ÍMPAR");
		}
	}

}
