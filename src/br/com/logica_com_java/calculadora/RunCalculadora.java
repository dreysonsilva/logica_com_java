package br.com.logica_com_java.calculadora;

import javax.swing.JOptionPane;

public class RunCalculadora {

	public static void main(String[] args) {
		
		Calculadora c = new Calculadora();
		
		Double numeroUm = Double.parseDouble(JOptionPane.showInputDialog("Numero 1"));
		c.setNumeroUm(numeroUm);
		
		Double numeroDois = Double.parseDouble(JOptionPane.showInputDialog("Numero 2"));
		c.setNumeroDois(numeroDois);	
		
		int op = Integer.parseInt(JOptionPane.showInputDialog("Deseja fazer: \n1-Soma\n2Subtração\n3-Multiplicação\n4-Divisão"));	
		
		switch(op) {
			case 1: System.out.println(c.soma());			
			break;
			
			case 2: System.out.println(c.subtrair());
			break;
			
			case 3: System.out.println(c.multiplicar());
			break;
			
			case 4: System.out.println(c.divisao());
			break;
			
			default: System.out.println("Opção incorreta!");
		}	
	}

}
