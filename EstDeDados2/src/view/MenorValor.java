package view;

import javax.swing.JOptionPane;
import controller.MenorValorController;

public class MenorValor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n[] = {5, 4, 3, 2, 9};
		int tamanho = n.length;
		int menor = n[4];
		MenorValorController menorClasse = new MenorValorController();
		int menorvalor = menorClasse.BuscarMenor(n, tamanho, menor);
		JOptionPane.showMessageDialog(null, menorvalor);
	}

}
