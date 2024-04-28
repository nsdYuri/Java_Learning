package br.com.fiap.conversoes.teste;
import java.util.Scanner;

public class TesteTamanho {
	public static void main(String[] args) {
		
		Scanner dados = new Scanner(System.in);
		
		String nome1, nome2;
		double altura1, altura2;
		double peso1, peso2;
		
		System.out.println("Digite o nome da primeira pessoa: ");
		nome1 = dados.nextLine();
		System.out.println("Digite o nome da segunda pessoa: ");
		nome2 = dados.nextLine();
		
		System.out.println("Informe qual é a altura da primeira pessoa: ");
		altura1 = dados.nextDouble();
		System.out.println("Informe qual é a altura da segunda pessoa: ");
		altura2 = dados.nextDouble();
		
		System.out.println("Informe quanto pesa a primeira pessoa: ");
		peso1 = dados.nextDouble();
		System.out.println("Informe quanto pesa a segunda pessoa: ");
		peso2 = dados.nextDouble();
		
		if (peso1 > peso2) {
			System.out.println(nome1 + " - É a pessoa mais pesada");
		} else {
			System.out.println(nome2 + " - É a pessoa mais pesada");
		}
		
		if (altura1 > altura2) {
			System.out.println(nome1 + " - É a pessoa mais alta");
		} else {
			System.out.println(nome2 + " - É a pessoa mais alta");
		}
	}

}
