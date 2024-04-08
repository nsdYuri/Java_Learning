package br.com.fiap.metodos.exercicios;

public class Aluno {
	
	String nome;
	int idade;
	double cp1, cp2, cp3, challenge, global;
	
	public double calculaMediaCp(double cp1, double cp2, double cp3) {
		double mediaCp = (cp1 + cp2 + cp3) / 3;
		return mediaCp;
	}
	
	public double mediaSemestral(double mediaCp, double challenge, double global) {
		double mediaSemestre = (mediaCp * 0.2) + (challenge * 0.2) + (global * 0.6);
		return mediaSemestre;
	}

}
