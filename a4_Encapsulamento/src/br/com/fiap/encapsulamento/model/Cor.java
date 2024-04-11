package br.com.fiap.encapsulamento.model;

public class Cor {
	
	// Atributos
	private String nome;
	private int r, g, b;
	
	public void alteraCor(int r, int g, int b, String nome) {
		this.r = r;
		this.g = g;
		this.b = b;
		this.nome = nome;
	}

	
	// Getters and Setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}

	public int getG() {
		return g;
	}

	public void setG(int g) {
		this.g = g;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}
	
	

}
