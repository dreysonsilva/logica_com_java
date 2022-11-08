import javax.swing.JOptionPane;

public class ProgramaQueLerNomeMostraMsg {
	public static void main(String[] args) {
		/* 2) Faça um programa que leia o nome de uma pessoa e mostre uma mensagem de boasvindas para ela:
			 Ex:
			 Qual é o seu nome? João da Silva
			 Olá João da Silva, é um prazer te conhecer!
		 */
		
		String nome = JOptionPane.showInputDialog("Qual é o seu nome?");
		
		System.out.println("Olá "+nome+ ", é um prazer te conhecer!");
	}
}
