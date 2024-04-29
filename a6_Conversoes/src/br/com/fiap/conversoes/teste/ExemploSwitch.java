package br.com.fiap.conversoes.teste;

import javax.swing.JOptionPane;

public class ExemploSwitch {
	public static void main(String[] args) {
		
		// Ler dois numeros
		int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero: "));
		int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro numero: "));
		
		// Ler uma opçao: 1 - Somar, 2 - Subtrair, 3 - Multiplicar, 4 - Dividir
		int opcao = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma opção: \n1-Somar \n2-Subtrair "
				+ "\n3-Multiplicar \n4-Dividir"));
		
		// Executar a opção escolhida
		switch (opcao) {
		case 1:
			double soma = numero1 + numero2;
			JOptionPane.showMessageDialog(null, "Soma: " + soma);
		break;
		case 2:
			double subtracao = numero1 - numero2;
			JOptionPane.showMessageDialog(null, "Subtração: " + subtracao);
		break;
		case 3:
			double multiplicacao = numero1 * numero2;
			JOptionPane.showMessageDialog(null, "Multiplicação: " + multiplicacao);
		break;
		case 4:
			double divisao = numero1 / numero2;
			JOptionPane.showMessageDialog(null, "Divisão: " + divisao);
		break;
		default:
			JOptionPane.showMessageDialog(null, "Opção invalida!");
		break;
		}
	}

}
