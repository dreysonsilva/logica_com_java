import javax.swing.JOptionPane;

public class Promo��oDiaDaMulher {

	public static void main(String[] args) {
		/*23) Numa promo��o exclusiva para o Dia da Mulher, uma loja quer dar descontos
			  para todos, mas especialmente para mulheres. Fa�a um programa que leia nome,
			  sexo e o valor das compras do cliente e calcule o pre�o com desconto. Sabendo que:
			  - Homens ganham 5% de desconto
	 	      - Mulheres ganham 13% de desconto
		 */
		
		String nome = JOptionPane.showInputDialog("Informe o nome");
		String sexo = JOptionPane.showInputDialog("Informe se Masculino com 'M' ou Feminino com 'F' ");
		double valor = Double.parseDouble(JOptionPane.showInputDialog("Informe valor"));
		double desconto=0;
		System.out.println("----LOJA JAVEIRN----");
		if(sexo.equals("M")) {
			desconto = (valor * 5)/100;
			System.err.println("Bem vindo,"+nome+"+\nValor com desconto: R$"+(valor-desconto)+" \nValor Descontado R$"+desconto );
		}else{
			desconto = (valor * 13)/100;
			System.err.println("Bem vindo(a) "+nome+"\nValor com desconto: R$"+(valor-desconto)+"\nValor descontado: R$"+desconto);
		}
		
	}

}
