package view;

import br.edu.fateczl.pilhaint.Pilha;
import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		int n;
		int acc = 1;
		Pilha s = new Pilha();
		
		do {
			n = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero entre 0-10"));
			
			for (int i = 1; i <= n; i++) {
				s.push(i);
			}
			
			while (!s.isEmpty()) {
				try {
					acc *= s.pop();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			
		} while (n < 0 || n > 10);
		
		JOptionPane.showMessageDialog(null, "O fatorial de " + n + " e igual a " + acc);
	}

}
