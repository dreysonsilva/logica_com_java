import javax.swing.JOptionPane;

public class NomeSalarioFuncionario {
	public static void main(String[] args) {
	/**
	 3) Crie um programa que leia o nome e o sal�rio de um funcion�rio, mostrando no
	final uma mensagem.
	Ex:
	Nome do Funcion�rio: Maria do Carmo
	Sal�rio: 1850,45
	O funcion�rio Maria do Carmo tem um sal�rio de R$1850,45 em Junho.
	*/
		
		String nome = JOptionPane.showInputDialog("Informe o nome do funcionario");
		double salario = Double.parseDouble(JOptionPane.showInputDialog("Informe o sal�rio"));
		
		System.out.println("Nome do Funcionario(a): "+nome+"\nSal�rio: "+salario+"\nO/A funcionario(a) "+nome+" tem o sal�rio de "+salario+" em junho.");
	}
}
