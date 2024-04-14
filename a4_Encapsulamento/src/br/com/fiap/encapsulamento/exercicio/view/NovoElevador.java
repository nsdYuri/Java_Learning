package br.com.fiap.encapsulamento.exercicio.view;

import br.com.fiap.encapsulamento.exercicio.model.Elevador;

public class NovoElevador {
	public static void main(String[] args) {
		
		// Instanciar um novo elevador
		Elevador lift = new Elevador();
		lift.setMaximoPessoas(8);
		lift.setTotalAndares(4);
		
		// inicializar o elevador
		lift.inicializa(8, 7);
		
		// 4 pessoas entram no elevador
		lift.entra(4);
		System.out.println("Total de pessoas no elevador: " + lift.getTotalPessoas());
		
		// 2 pessoas saem do elevador
		lift.sai(2);
		System.out.println("Total de pessoas no elevador: " + lift.getTotalPessoas());
		
		// Andar atual do elevador
		System.out.println("Andar de inicialização do elevaodr: " + lift.getAndarAtual());
		
		// Subindo 2 andares
		lift.sobe();
		lift.sobe();
		System.out.println("Andar atual do elevador: " + lift.getAndarAtual());
		
		// Descendo um andar
		lift.desce();
		System.out.println("Andar atual: " + lift.getAndarAtual());
		
		// Passando do limite de pessoas permitidas
		lift.entra(8);
		
		// Subindo mais do que o total de andares
		lift.sobe();
		lift.sobe();
		lift.sobe();
		lift.sobe();
		
		// Descendo mais do que o permitido
		lift.desce();
		lift.desce();
		lift.desce();
		lift.desce();
		lift.desce();
		lift.desce();
	}

}
