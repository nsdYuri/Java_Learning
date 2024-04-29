package br.com.fiap.strings.view;

public class ExemploComparacao {
	public static void main(String[] args) {
		
		// Declarar duas Strings
		String nome = "Fiap Faculdade de Tecnologia";
		String nome2 = new String("FIAP");
		
		// Verificar se os nomes são iguais
		if (nome.equals(nome2)) {
			System.out.println("Os nomes são iguais");
		} else {
			System.out.println("Os nomes são diferentes");
		}
		
		// Verificar se os nomes são iguais, não diferenciando maiusculas e minusculas
		if (nome.equalsIgnoreCase(nome2)) {
			System.out.println("Os nomes são iguais");
		} else {
			System.out.println("Os nomes são diferentes");
		}
		
		// imprimir a quantidade de letras da variavel nome
		System.out.println("Quantidade de lentras: " + nome.length());
		
		// Validar se o nome possui menos do que 20 caracteres
		if (nome.length() < 20) {
			System.out.println("\""+nome+"\"" + " Possui menos que 20 caracteres");
		} else { 
			System.out.println("\""+nome+"\"" + " Possui mais que 20 caracteres");
		}
	}

}
