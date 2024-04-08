package br.com.fiap.metodos.exercicios;

public class Endereco {
	
	// Atributos
	String logradouro;
	short numero;
	String complemento;
	String cep;
	
	
	public String retornarEndereco() {
		String endereco = logradouro + ", numero " + numero + ", CEP " + cep + ". Complemento: " + complemento;
		return endereco;
	}

}
