package br.com.fiap.conversoes.teste;
import javax.swing.JOptionPane;

public class ConversaoExplicita {
	public static void main(String[] args) {
		
		// Ler um numero do tipo double: peso da pessoa
		double peso = Double.parseDouble(JOptionPane.showInputDialog("Digite seu peso: "));
		
		// Converter o peso para um float
		float pesoFloat = (float) peso;
		
		// Converter o peso para um int
		int pesoInt = (int) peso;
		
		// Exibir o pesoFloat e o pesoInt
		JOptionPane.showMessageDialog(null, "Float: " + pesoFloat + " Int: " + pesoInt);
		
		float altura = 1.85f; // f no final define o numero como do tipo float
		
		int i = 10;
		short s = (short) i;
		
		
	}

}
