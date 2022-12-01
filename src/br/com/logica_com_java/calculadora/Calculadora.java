package br.com.logica_com_java.calculadora;

public class Calculadora implements Funcoes {
	private Double numeroUm;
	private Double numeroDois;

	public Calculadora() {
	}

	public Calculadora(Double numeroUm, Double numeroDois) {
		this.numeroUm = numeroUm;
		this.numeroDois = numeroDois;
	}

	public Double getNumeroUm() {
		return numeroUm;
	}

	public Double getNumeroDois() {
		return numeroDois;
	}

	public void setNumeroUm(Double numeroUm) {
		this.numeroUm = numeroUm;
	}

	public void setNumeroDois(Double numeroDois) {
		this.numeroDois = numeroDois;
	}

	@Override
	public Double soma() {
		double soma = this.numeroUm + this.numeroDois;
		return soma;
	}

	@Override
	public Double subtrair() {
		double sub = this.numeroUm - this.numeroDois;
		return sub;
	}

	@Override
	public Double multiplicar() {
		double multiplicacao = this.numeroUm * this.numeroDois;
		return multiplicacao;
	}

	@Override
	public String divisao() {
		if (this.numeroDois == 0) {
			return "Não é possível dividir por zero";
		}
		return " " + this.numeroUm / this.numeroDois;
	}

	public void opcao(int op) {
		switch (op) {
		case 1:
			System.out.println(soma());
			break;

		case 2:
			System.out.println(subtrair());
			break;

		case 3:
			System.out.println(multiplicar());
			break;

		case 4:
			System.out.println(divisao());
			break;

		default:
			System.out.println("Opção incorreta!");
		}
	}

}