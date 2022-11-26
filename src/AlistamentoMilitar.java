import java.util.Calendar;

import javax.swing.JOptionPane;

public class AlistamentoMilitar {

	public static void main(String[] args) {
		/*
		 * 22) Escreva um programa que leia o ano de nascimento de um rapaz e mostre a sua
			situação em relação ao alistamento militar.
			
			- Se estiver antes dos 18 anos, mostre em quantos anos faltam para o
			alistamento.
			
 			- Se já tiver depois dos 18 anos, mostre quantos anos já se passaram do
			alistamento.
			
		*/
		
		int anoNascimento = Integer.parseInt(JOptionPane.showInputDialog("Informe ano de nascimento"));
		
		int idade = Calendar.getInstance().get(Calendar.YEAR)-anoNascimento;
	
		if(idade<18 && idade>0) {
			System.out.println("Sua idade é "+idade+" e faltam apenas "+(18-idade)+" para o alistamento");
		}else if(idade>18){
			System.out.println("Já passou "+(idade-18)+ " do alistamento");
		}else {
			System.out.println("parece que já foi alistado");
		}
		System.out.println("Você tem "+idade+" anos de idade.");
	}

}
