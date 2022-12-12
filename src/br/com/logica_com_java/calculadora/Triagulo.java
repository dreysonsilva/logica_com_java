package br.com.logica_com_java.calculadora;

import javax.swing.JOptionPane;

public class Triagulo {

	public static void main(String[] args) {
		/*25) [DESAFIO] Crie um programa que leia o tamanho de três segmentos de reta.
	    Analise seus comprimentos e diga se é possível formar um triângulo com essas
	    retas. Matematicamente, para três segmentos formarem um triângulo, o comprimento
	    de cada lado deve ser menor que a soma dos outros dois.*/
		
		int lado1 = Integer.parseInt(JOptionPane.showInputDialog("Informe 1 reta"));
		int lado2 = Integer.parseInt(JOptionPane.showInputDialog("Informe 2 reta"));
		int lado3 = Integer.parseInt(JOptionPane.showInputDialog("Informe 3 reta"));
		
		if(((lado1 + lado2)<lado3) || (lado1 + lado3)<lado2 || (lado3 + lado2)<lado1 ) {
			System.out.println("Formando um triangulo...");
		}else {
			System.out.println("Não formamos um triagulo");
		}
	}

}
