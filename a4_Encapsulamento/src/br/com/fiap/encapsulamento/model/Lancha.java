package br.com.fiap.encapsulamento.model;

public class Lancha {
	
	
	// Atributos
	private String modelo;
	private int qtdLugares, anoFabricacao, qtdMotores;
	private double comprimento;
	private Cor cor;
	
	// Getters and Setters
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
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
	public int getQtdMotores() {
		return qtdMotores;
	}
	public void setQtdMotores(int qtdMotores) {
		this.qtdMotores = qtdMotores;
	}
	public double getComprimento() {
		return comprimento;
	}
	public void setComprimento(double comprimento) {
		this.comprimento = comprimento;
	}
	public Cor getCor() {
		return cor;
	}
	public void setCor(Cor cor) {
		this.cor = cor;
	}

	
	
}
