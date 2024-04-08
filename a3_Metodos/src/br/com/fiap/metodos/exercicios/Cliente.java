package br.com.fiap.metodos.exercicios;

public class Cliente {
	
	// Atributos
	String nome;
	String cpf;
	Endereco endereco;
	
	// Métodos
	public String retornarDados() {
		String dadosCliente = "Nome: " + nome + " | CPF: " + cpf + " | Endereço: " + endereco.retornarEndereco();
		return dadosCliente;
	}

}
