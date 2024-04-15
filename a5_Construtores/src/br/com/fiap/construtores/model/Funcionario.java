package br.com.fiap.construtores.model;

public class Funcionario {
	
	// Atributos
	private String nome;
	private long matricula;
	private Profissao profissao;
	private double salario;
	
	
	// Construtores
	public Funcionario(){
	}
	
	public Funcionario(long matricula){
		this.matricula = matricula;
	}
	
	public Funcionario(long matricula, String nome){
		this.matricula = matricula;
		this.nome = nome;
	}
	
	public Funcionario(long matricula, String nome, Profissao profissao){
		this.matricula = matricula;
		this.nome = nome;
		this.profissao = profissao;
	}
	
	public void exibirDados(Funcionario funcionario) {
		System.out.println(nome + " - " + matricula + ": " + profissao.getNome());
	}
	

	// Getters and Setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public long getMatricula() {
		return matricula;
	}

	public void setMatricula(long matricula) {
		this.matricula = matricula;
	}

	public Profissao getProfissao() {
		return profissao;
	}

	public void setProfissao(Profissao profissao) {
		this.profissao = profissao;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	

}
