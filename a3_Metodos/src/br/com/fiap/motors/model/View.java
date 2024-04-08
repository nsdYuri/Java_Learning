package br.com.fiap.motors.model;

public class View {
	public static void main(String[] args) {
		
		// Instanciando um carro
		Carro focus = new Carro();
		focus.modelo = "FORD FOCUS";
		focus.ano = 2018;
		focus.valor = 60990.00;
		
		
		// Utilizar método para calcular idade
		int idade = focus.calcularIdade(2024);
		System.out.println("Idade do carro: " + idade + " anos.");
		
		
		// Utilizar o método para atualizar o valor do carro
		focus.atualizaValor(2); /* Não é possivel atribuir esse valor uma variavel 
		pois o método é do tipo void então não retorna nada*/
		System.out.println("Valor atualizado: " + focus.valor);
		
		// Utilizar método para calcular o valor do seguro
		double seguro = focus.calculaSeguro();
		System.out.println("Valor do segura para este veiculo é de " + seguro + " reais.");
		
		// Utilizar método para exibir valor da parcela em 10x
		double parcelas = focus.parcelaSeguro(10);
		System.out.println(parcelas + " sera o valor de cada parcela, fazendo em 10x.");
	}

}
