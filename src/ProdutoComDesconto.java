import java.util.Scanner;

public class ProdutoComDesconto {

	public static void main(String[] args) {
		// Crie um programa que leia o pre�o de um produto, calcule e mostre o seu
		// PRE�O PROMOCIONAL, com 5% de desconto.
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Pre�o do produto: ");
		double produto = scanner.nextDouble();
		
		double produtoComDesconto = (produto *5) / 100;
		
		System.out.println("Pre�o Produto: "+produto);
		
		System.out.println("Valor de desconto de 5%: "+produtoComDesconto);
		
		System.out.println("Valor a pagar com desconto: "+(produto - produtoComDesconto));
		

	}

}
