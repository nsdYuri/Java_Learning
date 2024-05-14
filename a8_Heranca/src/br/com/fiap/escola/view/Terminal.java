package br.com.fiap.escola.view;

import br.com.fiap.escola.model.Aluno;
import br.com.fiap.escola.model.Pessoa;

public class Terminal {
	public static void main(String[] args) {
		
		// Instanciar uma pessoa
		Pessoa p1 = new Pessoa();
		p1.setCodigo(10);
		
		// Instanciar um aluno
		Aluno ike = new Aluno();
		ike.setCodigo(10);
		ike.setRm(552262);
		ike.setTurma("1TDSS");
	}

}
