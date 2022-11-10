import javax.swing.JOptionPane;

public class ConverteDinheiroCarteiraParaDolar {

	public static void main(String[] args) {
		/*
		 * 9) Faça um algoritmo que leia quanto dinheiro uma pessoa tem na carteira (em R$)
		 * e mostre quantos dólares ela pode comprar. Considere US$1,00 = R$3,45.
		 * */
		double valorEmDolar = 3.45;
		double qtdDinheiroCarteira =  Double.parseDouble(JOptionPane.showInputDialog("Informe quanto você tem em sua carteira"));
		
		double valorConvertidoDolar = qtdDinheiroCarteira  /valorEmDolar;
		
		/**
		 *Math.floor - Este metódo está arrendondando para baixo
		 */
		JOptionPane.showMessageDialog(null,"U$ "+ Math.floor(valorConvertidoDolar));
	}

}
