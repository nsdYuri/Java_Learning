package br.com.fiap.conversoes.teste;

import javax.swing.JOptionPane;

public class ConversaoStringPrimitivo {
	public static void main(String[] args) {
		
		// Definir uma variavel do tipo String
		String idade = "16";
		
		// Transformar a String em um tipo primitivo. São eles:
		// short, byte, int, long, float e double
		short idadeShort = Short.parseShort(idade);
		byte idadeByte = Byte.parseByte(idade);
		int idadeInt = Integer.parseInt(idade);
		long idadeLong = Long.parseLong(idade);
		float idadeFloat = Float.parseFloat(idade);
		double idadeDouble = Double.parseDouble(idade);
		
		// Ler uma idade
		idade = JOptionPane.showInputDialog("Digite quantos anos tem: ");
		
		// Exiba quanto falta para chegar aos 18 anos
		// Para isso converta a idade para int
		int intIdade = Integer.parseInt(idade);
		
		if (intIdade < 0) {
			JOptionPane.showMessageDialog(null, "Idade invalida!");
		}else if (intIdade < 18) {
			int restante = 18 - intIdade;
			JOptionPane.showMessageDialog(null, "Restam " + restante + " para completar 18 anos.");
		}else {
			JOptionPane.showMessageDialog(null, "Ja é maior de 18.");
		}
		
		
	}

}
