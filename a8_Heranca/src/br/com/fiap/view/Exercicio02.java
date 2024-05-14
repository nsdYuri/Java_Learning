package br.com.fiap.view;
import br.com.fiap.tds.model.produto.*;
import br.com.fiap.tds.model.livro.*;
import br.com.fiap.model.eletronico.*;

public class Exercicio02 {
	public static void main(String[] args) {
		
		// Instanciando novo smartphone
		Smartphone i13 = new Smartphone(10, "Iphone");
		i13.setCodigo(8);
		
		Editora marvel = new Editora();
		Livro livro = new Livro(10, "Homem de Ferro", marvel);
		
		Produto produto = new Livro(1, "Harry Potter");
		Produto produto2 = new LivroPerfil(12, "João é o pé de feijão");
		Produto produto3 = new Smartphone(12, "Xiaomi");
		
		Livro livro1 = new LivroPerfil(1, "João e Maria");
		
		
		
	}

}
