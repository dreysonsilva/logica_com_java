import javax.swing.JOptionPane;

public class ParOuImpar {

	public static void main(String[] args) {
		/*
		 * 20) Desenvolva um programa que leia um inteiro e motre se ele � par ou �mpar*/
		
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Informe o numero que deseja verificar se par ou �mpar"));
		
		if(numero %2==0) {
			JOptionPane.showMessageDialog(null, "PAR");
		}else {
			JOptionPane.showMessageDialog(null, "�MPAR");
		}
	}

}
