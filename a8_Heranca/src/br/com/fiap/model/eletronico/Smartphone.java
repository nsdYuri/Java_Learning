package br.com.fiap.model.eletronico;
import br.com.fiap.tds.model.produto.*;

public class Smartphone extends Produto{
	
	private String modelo, fabricante;
	private int memoria;

	public Smartphone(int codigo, String modelo) {
		super(codigo);
		this.modelo = modelo;
	}
	
	public Smartphone(int codigo, String modelo, String fabricante) {
		super(codigo);
		this.modelo = modelo;
		this.fabricante = fabricante;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public int getMemoria() {
		return memoria;
	}

	public void setMemoria(int memoria) {
		this.memoria = memoria;
	}
	
	
}
