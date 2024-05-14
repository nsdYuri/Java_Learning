package br.com.fiap.exercicio.model;

public class Lancha extends Veiculo{
	
	private int qtdMotores;
	
	public Lancha (String modelo, int qtdLugares, double comprimento, int anoFabricacao, int qtdMotores, Cor cor) {
		super(modelo, comprimento, qtdLugares, anoFabricacao, cor);
		this.qtdMotores = qtdMotores;
	}
	
	public int getQtdMotores() {
		return qtdMotores;
	}
	public void setQtdMotores(int qtdMotores) {
		this.qtdMotores = qtdMotores;
	}


}
