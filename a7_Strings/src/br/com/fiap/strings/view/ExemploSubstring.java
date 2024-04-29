package br.com.fiap.strings.view;

import javax.swing.JOptionPane;

public class ExemploSubstring {
	public static void main(String[] args) {
		
		// Ler um nome completo (nome, sobrenome), com JOptionPane;
		String nomeCompleto = JOptionPane.showInputDialog("Digite seu nome completo: ");
		
		// Exibir apenas o primeiro nome
		String primeiroNome = nomeCompleto.substring(0, nomeCompleto.indexOf(" ")); // " " (espaço) é p indice final
		JOptionPane.showMessageDialog(null, "Primeiro nome: " + primeiroNome);
		
		// Exibir apenas o sobrenome
		String sobrenome = nomeCompleto.substring(nomeCompleto.lastIndexOf(" ")+1); // +1 para iniciar no index após o espaço
		JOptionPane.showMessageDialog(null, "Sobrenome: " + sobrenome);
		
		// Ler uma data no formato (dd/mm/aaaa)
		String data = JOptionPane.showInputDialog("Informe uma data: ");
		
		// Exibir o dia
		String dia = data.substring(0, data.indexOf("/"));
		JOptionPane.showMessageDialog(null, "Dia: " + dia);
		
		// Exibir o mês
		String mes = data.substring(3, data.lastIndexOf("/"));
		JOptionPane.showMessageDialog(null, "Mês: " + mes);
		
		// Exibir o ano
		String ano = data.substring(data.lastIndexOf("/")+1);
		JOptionPane.showMessageDialog(null, "Ano: " + ano);
		
		// Ler um email
		String email = JOptionPane.showInputDialog("Digite seu email: ");
		
		// rm552262@fiap.com.br > fiap
		// Exiba apenas o dominio
		String dominio = email.substring(email.indexOf("@")+1, email.indexOf("."));
		JOptionPane.showMessageDialog(null, "Dominio do endereço de email - " + email + ": " + dominio);
		
		
		
	}

}
