import java.util.Scanner;

public class ProdutoComDesconto {

	public static void main(String[] args) {
		// Crie um programa que leia o preço de um produto, calcule e mostre o seu
		// PREÇO PROMOCIONAL, com 5% de desconto.
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Preço do produto: ");
		double produto = scanner.nextDouble();
		
		double produtoComDesconto = (produto *5) / 100;
		
		System.out.println("Preço Produto: "+produto);
		
		System.out.println("Valor de desconto de 5%: "+produtoComDesconto);
		
		System.out.println("Valor a pagar com desconto: "+(produto - produtoComDesconto));
		

	}

}
