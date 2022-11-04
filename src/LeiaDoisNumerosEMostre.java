import javax.swing.JOptionPane;

public class LeiaDoisNumerosEMostre {

	public static void main(String[] args) {
	/*4) Desenvolva um algoritmo que leia dois números inteiros e mostre o somatório
	entre eles.
	
	Ex:
	Digite um valor: 8
	Digite outro valor: 5
	A soma entre 8 e 5 é igual a 13.
	 */
		
		int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor"));
		int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro valor"));
		int soma = n1+n2;
		
		JOptionPane.showMessageDialog(null, "A soma entre "+n1+ " e "+n2+ " é igual a "+soma);
	}

}
