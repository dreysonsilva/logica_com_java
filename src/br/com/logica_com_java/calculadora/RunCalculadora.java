package br.com.logica_com_java.calculadora;

import javax.swing.JOptionPane;

public class RunCalculadora {

	public static void main(String[] args) {
		
		Calculadora c = new Calculadora();
		
		Double numeroUm = Double.parseDouble(JOptionPane.showInputDialog("Numero 1"));
		c.setNumeroUm(numeroUm);
		
		Double numeroDois = Double.parseDouble(JOptionPane.showInputDialog("Numero 2"));
		c.setNumeroDois(numeroDois);	
		
		int op = Integer.parseInt(JOptionPane.showInputDialog("Deseja fazer: \n1-Soma\n2Subtra��o\n3-Multiplica��o\n4-Divis�o"));	
		
		c.opcao(op);
	}

}
