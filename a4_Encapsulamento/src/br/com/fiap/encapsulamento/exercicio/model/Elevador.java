package br.com.fiap.encapsulamento.exercicio.model;

public class Elevador {
	
	// Atributos
	private int andarAtual = 0;
	private int totalAndares;
	private int maximoPessoas, totalPessoas;
	
	public void inicializa(int maximoPessoas, int totalAndares) {
		this.maximoPessoas = maximoPessoas;
		this.totalAndares = totalAndares;
	}
	
	public void entra(int qtdPessoas) {
		totalPessoas += qtdPessoas;
		int descerPessoas = totalPessoas - maximoPessoas;
		if (totalPessoas > maximoPessoas) {
			System.out.println("A capacidade máxima permitida no elevador "
					+ "foi atingida. Quantidade de pessoas que devem descer: " + descerPessoas );
		}
	}
	
	public void sai(int qtdPessoas) {
		totalPessoas -= qtdPessoas;
	}
	
	public void sobe() {
		andarAtual += 1;
		if (andarAtual > totalAndares) {
			System.out.println("Não é possivel subir mais um andar, esté é o último.");
		}
	}
	
	public void desce() {
		andarAtual -= 1;
		if (andarAtual < 0) {
			System.out.println("Não é possivel descer mais um andar, este é térreo.");
		}
	}

	public int getTotalAndares() {
		return totalAndares;
	}

	public void setTotalAndares(int totalAndares) {
		this.totalAndares = totalAndares;
	}

	public int getMaximoPessoas() {
		return maximoPessoas;
	}

	public void setMaximoPessoas(int maximoPessoas) {
		this.maximoPessoas = maximoPessoas;
	}
	
	public int getTotalPessoas() {
		return totalPessoas;
	}
	
	public int getAndarAtual() {
		return andarAtual;
	}

}
