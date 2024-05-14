package br.com.fiap.exercicio.model;

public class Veiculo {
	
	// Atributos
	private String modelo;
	private double comprimento;
	private int qtdLugares, anoFabricacao;
	private Cor cor;
	
	// Construtor
	public Veiculo(String modelo, double comprimento, int qtdLugares, int anoFabricacao, Cor cor) {
		this.modelo = modelo;
		this.comprimento = comprimento;
		this.qtdLugares = qtdLugares;
		this.anoFabricacao = anoFabricacao;
		this.cor = cor;
	}

	
	// Getters and Setters
	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public double getComprimento() {
		return comprimento;
	}

	public void setComprimento(double comprimento) {
		this.comprimento = comprimento;
	}

	public int getQtdLugares() {
		return qtdLugares;
	}

	public void setQtdLugares(int qtdLugares) {
		this.qtdLugares = qtdLugares;
	}

	public int getAnoFabricacao() {
		return anoFabricacao;
	}

	public void setAnoFabricacao(int anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}

	public Cor getCor() {
		return cor;
	}

	public void setCor(Cor cor) {
		this.cor = cor;
	}

}
