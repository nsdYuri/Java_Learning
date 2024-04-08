package br.com.fiap.exercicios;
import java.util.Scanner; // importando classe para coletar dados do usuario

public class Media {
	public static void main(String[] args) {
		
		// Criando um objeto do tipo Scanner para ler dados inseridos pelo usuario
		Scanner ler = new Scanner(System.in); 
		
		// Lendo dados
		// String: 
		System.out.println("Digite o nome do aluno: ");
		String nome = ler.nextLine(); //nextLine ira ler dado do tipo String
		
		// Int:
		System.out.println("Digite a idade do aluno: ");
		int idade = ler.nextInt(); // nextInt ira ler um dado do tipo inteiro
		
		// Double:
		System.out.println("Digite a nota do CheckPoint 1: ");
		double cp1 = ler.nextDouble(); // nextDouble ira ler um dado do tipo double
		
		System.out.println("Digite a nota do CheckPoint 2: ");
		double cp2 = ler.nextDouble(); 
		
		System.out.println("Digite a nota do CheckPoint 3: ");
		double cp3 = ler.nextDouble(); 
		
		System.out.println("Digite a nota do Challenge: ");
		double challenge = ler.nextDouble(); 
		
		System.out.println("Digite a nota da global: ");
		double global = ler.nextDouble(); 
		
		// Calcular media dos Checkpoints:
		double mediacp = (cp1 + cp2 + cp3) / 3;
		
		// Calcular média semestral
		double mediaSemestre = (mediacp * 0.2) + (challenge * 0.2) + (global * 0.6);
		
		// Exibir o nome e a média semestral do aluno
		System.out.println("Nome: " + nome + " | Média semestral: " + mediaSemestre);
		
		
		
		
	}

}
