package br.com.fiap.strings.view;

import javax.swing.JOptionPane;

public class Vogal2 {
	public static void main(String[] args) {
		
		// Ler uma palavra
		String palavra = JOptionPane.showInputDialog("Digite uma palavra: ");
		String vogais = "aeiou";
		
		// Criar um laço de repetição para percorrer todos os caracteres das vogais
		for (int i = 0; i < vogais.length(); i++) {
			// Para cada caracter substituir o i pelo *
			palavra = palavra.replace(vogais.charAt(i), '*');
		}
		
		//Exibir o resultado
		JOptionPane.showMessageDialog(null, palavra);
	}

}
