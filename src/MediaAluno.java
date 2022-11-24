import javax.swing.JOptionPane;

public class MediaAluno {

	public static void main(String[] args) {
		/*
		 * 19) Crie um algoritmo que leia o nome e as duas notas de um aluno, calcule a sua
		 * média e mostre na tela. No final, analise a média e mostre se o aluno teve ou
		 * não um bom aproveitamento (se ficou acima da média 7.0).
		 */
		
		String nome = JOptionPane.showInputDialog("Informe seu nome");
		
		double notaUm = Double.parseDouble(JOptionPane.showInputDialog("Informe nota 1"));
		double notaDois = Double.parseDouble(JOptionPane.showInputDialog("Informe nota 2"));
		
		double media  = (notaUm + notaDois)/2;
		
		if(media>6.9) {
			
			System.out.println("Bem vindo "+nome+" você está acima da média e sua media foi "+media);
		}else {
			System.out.println("Bem vindo "+nome+" você está abaixo da média e sua media foi "+media);
		}
	}

}
