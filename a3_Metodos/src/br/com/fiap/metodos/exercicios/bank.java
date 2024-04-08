package br.com.fiap.metodos.exercicios;
import java.util.Scanner;

public class bank {
	public static void main(String[] args) {
		
		// Instanciando novo scanner
		Scanner leitor = new Scanner(System.in);
		
		// Instanciando um novo endereco
		Endereco casa = new Endereco();
		
		casa.logradouro = "Rua aqui depois ali";
		casa.numero = 44;
		casa.cep = "04425202";
		casa.complemento = "Apto 84 bloco Verde";
		
		// Instanciando um novo cliente
		Cliente ike = new Cliente();
		
		ike.nome = "Yuri";
		ike.cpf = "1234567890";
		ike.endereco = casa;
		
		// Instanciando uma nova conta corrente
		ContaCorrente san = new ContaCorrente();
		
		san.titular = ike;
		san.saldo = 689.76;
		
		// Chamando métodos
		String dados = ike.retornarDados();
		System.out.println("Dados cliente: " + dados);
		
		String enderecoCompleto = casa.retornarEndereco();
		System.out.println("Endereço cliente: " + enderecoCompleto);
		
		System.out.println("Informe quando deseja sacar: ");
		double sacarDinheiro = leitor.nextDouble();
		san.sacar(sacarDinheiro);
		System.out.println("Saldo atualizado: " + san.saldo);
		
		System.out.println("Informe quando deseja depositar: ");
		double depositarDinheiro = leitor.nextDouble();
		san.depositar(depositarDinheiro);
		System.out.println("Saldo atualizado: " + san.saldo);
		
		
		
	}

}
