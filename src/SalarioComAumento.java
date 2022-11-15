import javax.swing.JOptionPane;

public class SalarioComAumento {

	public static void main(String[] args) {
		//13) Faça um algoritmo que leia o salário de um funcionário, calcule e mostre o
	    //seu novo salário, com 15% de aumento.
		
		double salario = Double.parseDouble(JOptionPane.showInputDialog("Informe o salario"));
		double aumento = salario * ((salario *0.15) / 100);
		
		System.out.println("Salário sem aumento: "+salario);
		System.out.println("Salario com aumento: "+salario+aumento);

	}

}
