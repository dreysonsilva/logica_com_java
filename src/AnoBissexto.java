import java.util.Scanner;

public class AnoBissexto {

	public static void main(String[] args) {
		/*
		 * 21) Fa�a um algoritmo que leia determinado ano e mostre se � ou n�o BISSEXTO */
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Informe o ano que deseja saber se � bissexto");
		int ano = Integer.parseInt(scanner.next());
		
		if(ano%4==0) {
			System.out.println("Opa, ano bissexto");
		}else {
			System.out.println("N�o � um ano bissexto");
		}
	}

}
