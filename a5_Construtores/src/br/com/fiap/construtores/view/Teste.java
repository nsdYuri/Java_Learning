package br.com.fiap.construtores.view;

import br.com.fiap.construtores.model.Funcionario;
import br.com.fiap.construtores.model.Profissao;

public class Teste {
	public static void main(String[] args) {
		
		// Instanciando profissão utilizando o construtor
		Profissao datamaster = new Profissao("Analista de dados");
		
		// Instanciar um funcionarios utilizando os contrutores
		Funcionario eu = new Funcionario(798564, "Yuri", datamaster);
		
		// Chamar funcão para exibir dados
		eu.exibirDados(eu);
	}

}
