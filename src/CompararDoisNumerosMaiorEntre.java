
public class CompararDoisNumerosMaiorEntre {

	public static void main(String[] args) {
		/*26) Escreva um algoritmo que leia dois números inteiros e compare-os, mostrando
			  na tela uma das mensagens abaixo:
			  - O primeiro valor é o maior
		 	  - O segundo valor é o maior
			  - Não existe valor maior, os dois são iguais
		 */
		
		double n1 = 10;
		double n2 = 10;
		
		if(n1>n2) {
			System.out.println("O primeiro valor é o maior");
		}else if(n2>n1) {
			System.out.println("O segundo valor é o maior");
		}else {
			System.out.println("Não existe valor maior, os dois são iguais"); 
		}
	}
}