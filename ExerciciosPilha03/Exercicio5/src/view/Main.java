package view;

import javax.swing.JOptionPane;
import controller.PalindromeController;

public class Main {

	public static void main(String[] args) {
		
		PalindromeController pController = new PalindromeController();
		
		String s = "";
		
		do {
			s = JOptionPane.showInputDialog("Digite uma palavra ou frase para ser verificada");
			
			if (s != null) {
				if (pController.isPalindrome(s)) {
					JOptionPane.showMessageDialog(null, "É um palíndromo");
				} else {
					JOptionPane.showMessageDialog(null, "Não é um palíndromo");
				}
			}
		} while (s != null);

	}

}
