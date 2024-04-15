package br.com.fiap.construtores.exercicio.model;

public class Fabricante {
	
	private String nome;
	private String cnpj;
	
	// Criar um construtor que recebe o nome e o cnpj
	public  Fabricante(String nome, String cnpj) {
		this.nome = nome;
		this.cnpj = cnpj;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	

}
