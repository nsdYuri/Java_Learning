package br.com.fiap.metodos.exercicios;

public class ContaCorrente {
	
	// Atributos
	double saldo;
	Cliente titular;
	
	// Métodos
	public void depositar(double valor) {
		saldo += valor;
	}
	
	public void sacar(double valor) {
		saldo -= valor;
	}
	
	public double retornarSaldo() {
		return saldo;
	}

}
