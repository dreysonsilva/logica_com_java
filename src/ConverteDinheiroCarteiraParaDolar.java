import javax.swing.JOptionPane;

public class ConverteDinheiroCarteiraParaDolar {

	public static void main(String[] args) {
		/*
		 * 9) Fa�a um algoritmo que leia quanto dinheiro uma pessoa tem na carteira (em R$)
		 * e mostre quantos d�lares ela pode comprar. Considere US$1,00 = R$3,45.
		 * */
		double valorEmDolar = 3.45;
		double qtdDinheiroCarteira =  Double.parseDouble(JOptionPane.showInputDialog("Informe quanto voc� tem em sua carteira"));
		
		double valorConvertidoDolar = qtdDinheiroCarteira  /valorEmDolar;
		
		/**
		 *Math.floor - Este met�do est� arrendondando para baixo
		 */
		JOptionPane.showMessageDialog(null,"U$ "+ Math.floor(valorConvertidoDolar));
	}

}
