package br.com.fiap.construtores.exercicio.view;

import br.com.fiap.construtores.exercicio.model.Bicicleta;
import br.com.fiap.construtores.exercicio.model.Fabricante;

public class Terminal {
	public static void main(String[] args) {
		
		// Instanciar uma nova fabricante
		Fabricante ca = new Fabricante("Caloi", "123465789");
		// Com os contrutores, não é mais necessário setar da maneira abaixo
		//ca.setNome("Caloi");
		//ca.setCnpj("123465789");
		
		// Instanciar uma bicicleta
		Bicicleta bike = new Bicicleta(29, "RXB-300", 27.8, ca);
		
		// Exibir dados da bicicleta
		String dados = bike.retornaDetalhes();
		System.out.println(dados);
		
		// Exibir Fabricante
		System.out.println("Fabricante: " + bike.getFabricante().getNome());
	}

}
