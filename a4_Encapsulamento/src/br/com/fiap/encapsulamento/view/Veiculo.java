package br.com.fiap.encapsulamento.view;

import br.com.fiap.encapsulamento.model.*;

public class Veiculo {
	public static void main(String[] args) {
		
		// Instanciar uma cor
		Cor bronze = new Cor();
		
		// Setando atributos da cor
		bronze.setR(219);
		bronze.setG(147);
		bronze.setB(112);
		bronze.setNome("Bronze");
		
		// Instanciando um novo carro
		Carro namera = new Carro();
		
		namera.setModelo("Porsche Panamera 2024");
		namera.setAnoFabricacao(2024);
		namera.setCor(bronze);
		namera.setPlaca("IKE-2004");
		namera.setQtdLugares(5);
		namera.setQtdPortas(4);
		namera.setComrimento(5.05);
		namera.setMotor(4.8f);
		
		// Exibir alguns valores
		System.out.println("Ficha técnica " + namera.getModelo() + ": Ano - " + namera.getAnoFabricacao() + 
				", Quantidade de portas - " + namera .getQtdPortas() + ", Quantidade de Lugares - " + namera.getQtdLugares());
		
		// Exibir personalizaçõçes, cor e placa
		System.out.println("Modelo: " + namera.getModelo() + "| Cor: " + namera.getCor() + "| Placa: " + namera.getPlaca());
		
		
		// Instanciando uma nova cor 
		Cor wt = new Cor();
		wt.setR(255);
		wt.setG(255);
		wt.setB(255);
		wt.setNome("Branco");
		
		// Instanciando uma Lancha
		Lancha lan = new Lancha();
		lan.setModelo("Astondoa 106");
		lan.setAnoFabricacao(2018);
		lan.setCor(wt);
		lan.setQtdLugares(18);
		lan.setQtdMotores(2);
		lan.setComprimento(9.8);
		
		// Exibir o nome e a cor da lancha
		System.out.println("Nome: " + lan.getModelo() + "| Cor: " + lan.getCor());
		
	}

}
