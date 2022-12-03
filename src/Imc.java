import javax.swing.JOptionPane;

public class Imc {

	public static void main(String[] args) {
		
		
		String nome = JOptionPane.showInputDialog("Informe nome");

		double peso = Double.parseDouble(JOptionPane.showInputDialog("Informe peso"));
		
		double altura = Double.parseDouble(JOptionPane.showInputDialog("Informe altura"));
		
		double imc = peso/(altura*altura);
		
		System.out.println("Bem vindo "+nome+" seu imc: "+Math.round(imc)); 
		

	}

}
