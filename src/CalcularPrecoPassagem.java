import javax.swing.JOptionPane;

public class CalcularPrecoPassagem {

	public static void main(String[] args) {
		/*24) Fa�a um algoritmo que pergunte a dist�ncia que um passageiro deseja
		  percorrer em Km. Calcule o pre�o da passagem, cobrando R$0.50 por Km para
		  viagens at� 200Km e R$0.45 para viagens mais longas
		*/  
		double precoPassagem =0.0;
		int distancia = Integer.parseInt(JOptionPane.showInputDialog("Distancia que deseja pecorrer"));
		
		if(distancia <=200) {
			precoPassagem = distancia * 0.50;
			System.out.println(precoPassagem);
		}else {
			precoPassagem = distancia * 0.45;
			System.out.println(precoPassagem);
		}
	}

}
