import javax.swing.JOptionPane;

public class CalcularPrecoPassagem {

	public static void main(String[] args) {
		/*24) Faça um algoritmo que pergunte a distância que um passageiro deseja
		  percorrer em Km. Calcule o preço da passagem, cobrando R$0.50 por Km para
		  viagens até 200Km e R$0.45 para viagens mais longas
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
