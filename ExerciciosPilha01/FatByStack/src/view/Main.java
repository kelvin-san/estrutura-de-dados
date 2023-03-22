package view;

import br.edu.fateczl.pilhaint.Pilha;
import javax.swing.JOptionPane;
import controller.FatController;

public class Main {

	public static void main(String[] args) {
		FatController fat = new FatController();
		int n, result;
		
		do {
			n = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero entre 0-10"));
			
			result = fat.FatByStack(n);
		} while (n < 0 || n > 10);
		
		JOptionPane.showMessageDialog(null, "O fatorial de " + n + " e igual a " + result);
	}

}
