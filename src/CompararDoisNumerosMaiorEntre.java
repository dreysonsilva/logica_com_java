
public class CompararDoisNumerosMaiorEntre {

	public static void main(String[] args) {
		/*26) Escreva um algoritmo que leia dois n�meros inteiros e compare-os, mostrando
			  na tela uma das mensagens abaixo:
			  - O primeiro valor � o maior
		 	  - O segundo valor � o maior
			  - N�o existe valor maior, os dois s�o iguais
		 */
		
		double n1 = 10;
		double n2 = 10;
		
		if(n1>n2) {
			System.out.println("O primeiro valor � o maior");
		}else if(n2>n1) {
			System.out.println("O segundo valor � o maior");
		}else {
			System.out.println("N�o existe valor maior, os dois s�o iguais"); 
		}
	}
}