package br.com.fiap.construtores.exercicio.model;

public class Bicicleta {
	
	// Atributos
	private int aro;
	private String modelo;
	private double peso;
	private Fabricante fabricante;
	
	// Construtor que recebe o aro e o modelo
	public Bicicleta(int aro, String modelo) {
		this.aro = aro;
		this.modelo = modelo;
	}
	
	// Implementar um construtor que recebe todos os atributos
	public Bicicleta(int aro, String modelo, double peso, Fabricante fabricante) {
		this(aro,modelo); // Maneira de chamar o construtor existente com aro e modelo como parametros
		// this.aro = aro;
		// this.modelo = modelo;
		this.peso = peso;
		this.fabricante = fabricante;
	}
	
	public String retornaDetalhes() {
		return "Modelo: " + modelo + ", aro - " + aro + " peso: " + peso;
	}

	public int getAro() {
		return aro;
	}

	public void setAro(int aro) {
		this.aro = aro;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public Fabricante getFabricante() {
		return fabricante;
	}

	public void setFabricante(Fabricante fabricante) {
		this.fabricante = fabricante;
	}
	
	

}
