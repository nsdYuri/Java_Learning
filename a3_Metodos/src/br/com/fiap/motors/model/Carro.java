package br.com.fiap.motors.model;

public class Carro {
	
	// Atributos
	String modelo;
	int ano;
	double valor;
	
	// Métodos
	// Criar um método para calcular a idade atual do carro
	public int calcularIdade(int anoAtual) {
		// calcuando idade
		int idade = anoAtual - ano;
		// retornando o valor da variavel declarada
		return idade;
	}
	
	// Criar um método para atualizar o valor do carro
	public void atualizaValor(double porcentagem) {
		valor *= (1 + porcentagem);
	}
	
	// Criar um método que calcula e retorna o valor do seguro do carro
	// Seguro do carro é baseado no valor do carro, %5 de seu valor
	public double calculaSeguro() {
		double seguro = valor * 0.5;
		return seguro;
	}
	
	/* Criar um método que recebe a quantidade de parcelas, calcula e retorna 
	o valor da parcela do seguro */
	public double parcelaSeguro(int qtdParcelas) {
		double parcela = (valor * 0.5) / qtdParcelas;
		return parcela;
	}

}
