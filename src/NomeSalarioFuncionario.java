import javax.swing.JOptionPane;

public class NomeSalarioFuncionario {
	public static void main(String[] args) {
	/**
	 3) Crie um programa que leia o nome e o salário de um funcionário, mostrando no
	final uma mensagem.
	Ex:
	Nome do Funcionário: Maria do Carmo
	Salário: 1850,45
	O funcionário Maria do Carmo tem um salário de R$1850,45 em Junho.
	*/
		
		String nome = JOptionPane.showInputDialog("Informe o nome do funcionario");
		double salario = Double.parseDouble(JOptionPane.showInputDialog("Informe o salário"));
		
		System.out.println("Nome do Funcionario(a): "+nome+"\nSalário: "+salario+"\nO/A funcionario(a) "+nome+" tem o salário de "+salario+" em junho.");
	}
}
