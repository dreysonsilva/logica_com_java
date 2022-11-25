import java.util.Scanner;

public class AnoBissexto {

	public static void main(String[] args) {
		/*
		 * 21) Faça um algoritmo que leia determinado ano e mostre se é ou não BISSEXTO */
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Informe o ano que deseja saber se é bissexto");
		int ano = Integer.parseInt(scanner.next());
		
		if(ano%4==0) {
			System.out.println("Opa, ano bissexto");
		}else {
			System.out.println("Não é um ano bissexto");
		}
	}

}
