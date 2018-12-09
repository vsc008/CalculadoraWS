package org.ws.calc;

public class Calculadora {
	
	// Efetua a soma de dois números
	public double soma(double i, double j) {
		double resultadoSoma;
		resultadoSoma = i + j;
		return resultadoSoma;
	}
	// Efetua a subtração de dois números
	public double subtracao(double i, double j) {
		double resultadoSubtracao;
		resultadoSubtracao = i - j;
		return resultadoSubtracao;
	}
	// Efetua a multiplicação de dois números
	public double multiplicacao(double i, double j) {
		double resultadoMultiplicacao;
		resultadoMultiplicacao = i * j;
		return resultadoMultiplicacao;
	}
	// Efetua a divisão entre dois números
	public double divisao(double i, double j) {
		double resultadoDivisao;
		resultadoDivisao = i / j;
		return resultadoDivisao;
	}
}
