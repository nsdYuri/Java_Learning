package br.com.fiap.conversoes.exercicios;

import javax.swing.JOptionPane;

public class TesteEleitores {
	public static void main(String[] args) {
		
		// Armazena o total de eleitores obrigatorios
		int eleitoresObg = 0;
		
		// Laço de repetição
		// (variavel de controle, condiciao de parada, incremento)
		for (int i = 0; i < 3; i++) {
			// Ler a idade
			int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade: "));
			
			// Classificar a classe eleitoral
			if (idade >= 18 && idade <= 65) {
				eleitoresObg++;
				JOptionPane.showMessageDialog(null, "Eleitor Obrigatório.");
			} else if (idade == 16 || idade == 17 || idade > 65) {
				JOptionPane.showMessageDialog(null, "Eleitor Facultativo.");
			} else {
				JOptionPane.showMessageDialog(null, "Não eleitor.");
			}
		}
	
		// Exibir total de eleitores obrigatórios
		JOptionPane.showMessageDialog(null, "Total Eleitores Obrigatórios: " + eleitoresObg);
		
	}

}
