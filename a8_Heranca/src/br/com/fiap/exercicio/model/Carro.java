package br.com.fiap.exercicio.model;

public class Carro extends Veiculo {
	
	private String placa;
	private int qtdPortas;
	private float motor = 1;
	
	public Carro(String modelo, int qtdLugares, int qtdPortas, double comprimento, int anoFabricacao, Cor cor, String placa,
			float motor) {
		super(modelo, comprimento, qtdLugares, anoFabricacao, cor);
		this.placa = placa;
		this.qtdPortas = qtdPortas;
		this.motor = motor;
	}

	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public int getQtdPortas() {
		return qtdPortas;
	}
	public void setQtdPortas(int qtdPortas) {
		this.qtdPortas = qtdPortas;
	}

	public float getMotor() {
		return motor;
	}
	public void setMotor(float motor) {
		this.motor = motor;
	}

}
