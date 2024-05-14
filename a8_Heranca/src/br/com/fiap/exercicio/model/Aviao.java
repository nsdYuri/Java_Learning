package br.com.fiap.exercicio.model;

public class Aviao extends Veiculo{
	
	private String preifxo;
	private int qtdTurbinas;
	
	public Aviao(String prefixo, String modelo, int qtdLugares, double comprimento, int anoFabricacao, 
			int qtdTurbinas, Cor cor) {
		super(modelo, comprimento, qtdLugares, anoFabricacao, cor);
		this.preifxo = prefixo;
		this.qtdTurbinas = qtdTurbinas;
	}

	public String getPreifxo() {
		return preifxo;
	}
	public void setPreifxo(String preifxo) {
		this.preifxo = preifxo;
	}
	public int getQtdTurbinas() {
		return qtdTurbinas;
	}
	public void setQtdTurbinas(int qtdTurbinas) {
		this.qtdTurbinas = qtdTurbinas;
	}

}
