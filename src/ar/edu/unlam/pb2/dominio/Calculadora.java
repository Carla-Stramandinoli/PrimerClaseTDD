package ar.edu.unlam.pb2.dominio;

public class Calculadora {

	public int sumar(int valorUno, int valorDos) {
		return valorUno + valorDos;
	}

	public int dividir(int numerador, int denominador) {

		if (denominador == 0) {
			return 0;
		}

		return numerador / denominador;
	}

}
