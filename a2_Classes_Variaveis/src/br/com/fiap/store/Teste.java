package br.com.fiap.store;

public class Teste {
	public static void main(String[] args) { // Método que torna a classe executavel
		
		// Criar um objeto do tipo "Editora" - Instanciando a classe
		
		Editora churros = new Editora();
		churros.nome = "Editora black";
		churros.endereco = "Avenida dos curiosos 1234";
		churros.cnpj = "987654321";
		
		// Criar outro objeto do tipo Editora
		Editora vba = new Editora();
		vba.nome = "Vai Brasil";
		vba.endereco = "Rua Croacia empata as 4 minutos";
		vba.cnpj = "0111111101";
		
		// Criar um objeto do tipo "Ebook" - Instanciar a classe
		Ebook copa = new Ebook();
		copa.nome = "Qatar";
		copa.genero = "futebol";
		copa.idioma = "arabe";
		copa.qtdPaginas = 104;
		copa.rating = 9.5;
		copa.resumo = "Ebook criado para relatar os acontecimentos por pagina de cada jogo" + 
		" da copa do mundo.";
		copa.valor = 642.99;
		copa.editora = vba;
		
		// Exibir o nome da editora no objeto churros
		System.out.println("O nome da editora churros é: " + churros.nome);
		
		// Exibir o nome e valor da editora e do ebook
		System.out.println("Editora: " + vba.nome + " | Valor: " + copa.valor);
	}

}
