import javax.swing.JOptionPane;

public class ProgramaQueLerNomeMostraMsg {
	public static void main(String[] args) {
		/* 2) Fa�a um programa que leia o nome de uma pessoa e mostre uma mensagem de boasvindas para ela:
			 Ex:
			 Qual � o seu nome? Jo�o da Silva
			 Ol� Jo�o da Silva, � um prazer te conhecer!
		 */
		
		String nome = JOptionPane.showInputDialog("Qual � o seu nome?");
		
		System.out.println("Ol� "+nome+ ", � um prazer te conhecer!");
	}
}
