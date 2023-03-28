package view;

import javax.swing.JOptionPane;
import controller.ConvertingController;

public class Main {

	public static void main(String[] args) {
		
		int n;
		ConvertingController bin = new ConvertingController();
		
		do {
			n = Integer.parseInt(JOptionPane.showInputDialog("Digite um número decimal a ser convertido"));
			if (n > 1000 || n < 0) {
				JOptionPane.showMessageDialog(null, "Digite um número entre 0 e 1000");
			}
		} while (n > 1000 || n < 0);
		
		JOptionPane.showMessageDialog(null, n + " em binário é " + bin.decToBin(n));

	}

}
