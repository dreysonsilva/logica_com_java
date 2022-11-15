import javax.swing.JOptionPane;

public class CorretoraCarros {

	public static void main(String[] args) {
		/*14) A locadora de carros precisa da sua ajuda para cobrar seus serviços. 
		Escreva um programa que pergunte a quantidade de Km percorridos por um carro alugado e a
		quantidade de dias pelos quais ele foi alugado. Calcule o preço total a pagar,
		sabendo que o carro custa R$90 por dia e R$0,20 por Km rodado.
		 */
		
		double qtdKmPercorridoPorCarroAlugado = Double.parseDouble(JOptionPane.showInputDialog("a quantidade de Km percorridos por um carro alugado"));
		int qtdDiasAlugados = Integer.parseInt(JOptionPane.showInputDialog("quantidade de dias pelos quais ele foi alugado"));
	
		qtdKmPercorridoPorCarroAlugado = qtdKmPercorridoPorCarroAlugado * 0.20;
		qtdDiasAlugados = qtdDiasAlugados *90;
		System.out.println("CORRETORA CARVANE");
		System.out.println("Valor a pagar: R$ "+(qtdDiasAlugados+qtdKmPercorridoPorCarroAlugado));
	}
}