import javax.swing.JOptionPane;

public class SalarioComAumento {

	public static void main(String[] args) {
		//13) Fa�a um algoritmo que leia o sal�rio de um funcion�rio, calcule e mostre o
	    //seu novo sal�rio, com 15% de aumento.
		
		double salario = Double.parseDouble(JOptionPane.showInputDialog("Informe o salario"));
		double aumento = salario * ((salario *0.15) / 100);
		
		System.out.println("Sal�rio sem aumento: "+salario);
		System.out.println("Salario com aumento: "+salario+aumento);

	}

}
