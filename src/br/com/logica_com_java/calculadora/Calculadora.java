package br.com.logica_com_java.calculadora;

public class Calculadora implements Funcoes {
	private Double numeroUm;
	private Double numeroDois;
	
	public Calculadora() {}
	
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
	public Double divisao() {
		return this.numeroUm / this.numeroDois;
	}
}