package br.com.fiap.metodos.exercicios;
import java.util.Scanner;

public class NewAluno {
	public static void main(String[] args) {
		
		// Instanciando novo Scanner
		Scanner ler = new Scanner(System.in);
		
		// Instanciando novo aluno
		Aluno eu = new Aluno();
		
		System.out.println("Digite o nome do aluno: ");
		eu.nome = ler.nextLine();
		
		System.out.println("Informe a idade do aluno: ");
		eu.idade = ler.nextInt();
		
		System.out.println("Nota Cp1: ");
		eu.cp1 = ler.nextDouble();
		System.out.println("Nota Cp2: ");
		eu.cp2 = ler.nextDouble();
		System.out.println("Nota Cp3: ");
		eu.cp3 = ler.nextDouble();
		
		System.out.println("Nota Challenge: ");
		eu.challenge = ler.nextDouble();
		
		System.out.println("Nota Global: ");
		eu.global = ler.nextDouble();
		
		double mediaCps = eu.calculaMediaCp(eu.cp1, eu.cp2, eu.cp3);
		System.out.println("Aluno " + eu.nome + " | Média Checkpoints: " + mediaCps);
		
		double mediaFinal = eu.mediaSemestral(mediaCps, eu.challenge, eu.global);
		System.out.println(eu.nome + " finalizou o semestre com média de " + mediaFinal);
	}

}
