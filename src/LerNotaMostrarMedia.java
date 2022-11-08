import java.util.Scanner;

public class LerNotaMostrarMedia {

	public static void main(String[] args) {
		/**
		  5) Faça um programa que leia as duas notas de um aluno em uma matéria e mostre
			na tela a sua média na disciplina.
			Ex:
			Nota 1: 4.5
			Nota 2: 8.5
			A média entre 4.5 e 8.5 é igual a 6.5
		 */

		Scanner s = new Scanner(System.in);
		
		System.out.println("Informe primeira nota");
		double nota1 = Double.parseDouble(s.next());
		
		System.out.println("Informe segunda nota");
		double nota2 = Double.parseDouble(s.next());
		
		double media = (nota1 +nota2)/2;
		
		System.out.println("Nota 1: "+nota1+"\nota2 "+"\nA média entre: "+nota1+" e "+nota2+" é igual a  "+media);
	
	}

}
