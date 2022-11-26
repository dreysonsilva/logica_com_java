import java.util.Calendar;

import javax.swing.JOptionPane;

public class AlistamentoMilitar {

	public static void main(String[] args) {
		/*
		 * 22) Escreva um programa que leia o ano de nascimento de um rapaz e mostre a sua
			situa��o em rela��o ao alistamento militar.
			
			- Se estiver antes dos 18 anos, mostre em quantos anos faltam para o
			alistamento.
			
 			- Se j� tiver depois dos 18 anos, mostre quantos anos j� se passaram do
			alistamento.
			
		*/
		
		int anoNascimento = Integer.parseInt(JOptionPane.showInputDialog("Informe ano de nascimento"));
		
		int idade = Calendar.getInstance().get(Calendar.YEAR)-anoNascimento;
	
		if(idade<18 && idade>0) {
			System.out.println("Sua idade � "+idade+" e faltam apenas "+(18-idade)+" para o alistamento");
		}else if(idade>18){
			System.out.println("J� passou "+(idade-18)+ " do alistamento");
		}else {
			System.out.println("parece que j� foi alistado");
		}
		System.out.println("Voc� tem "+idade+" anos de idade.");
	}

}
