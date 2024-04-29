package br.com.fiap.conversoes.teste;

import javax.swing.JOptionPane;

public class ConversaoImplicita {
	public static void main(String[] args) {
		
		// Ler a populacao da cidade de Bauru
		int populacao = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero total da população de Bauru: "));
		
		// Que tipos de variaveis é possivel classificar a população
		float populacaoFloat = populacao;
		double populacaoDouble = populacao;
		long populacaoLong = populacao;
		
		// Não funciona!
		// short populacaoShort = populacao;
		// populacaoFloat = populacaoDouble;
		
		// Exibir a populacao
		JOptionPane.showMessageDialog(null, "População total: " + populacao);
	}

}
