package controller;

import br.edu.fateczl.StringStack;
import javax.swing.JOptionPane;

public class HistoryController {
	
	public HistoryController() {
		super();
	}
	
	public StringStack menu(StringStack s) {
		String a;
		do {
			a = JOptionPane.showInputDialog("MENU\n\n1. Adicionar endereço;\n2. Remover último endereço\n3. Visualizar último endereço\n\n");
			try {
				int opt = Integer.parseInt(a);
				switch(opt) {
					case 1:
						s = addAddress(s);
						break;
					case 2:
						s = removeLastAddress(s);
						break;
					case 3:
						s = getLastAddress(s);
						break;
					default:
						JOptionPane.showMessageDialog(null, "Digite uma opção válida");
				}
			} catch (NumberFormatException e) {
				if (a != null) {
					JOptionPane.showMessageDialog(null, "Digite uma opção válida");
				}
			}
		} while (a != null);
		
		return s;
	}

	private StringStack addAddress(StringStack s) {
		String ad = JOptionPane.showInputDialog("Digite o endereço a ser adicionado");
		int adLength = ad.length();
		
		if (adLength > 12) {
			String adFirstPart = "";
			for (int i = 0; i < 12; i++) {
				adFirstPart += ad.charAt(i);
			}
			
			boolean contain2Dots = false;
			int c = 0;
			for (int i = 0; i < adLength; i++) {
				if (String.valueOf(ad.charAt(i)).intern().equals(".")) {
					c++;
				}
			}
			if (c >= 2) {
				contain2Dots = true;
			}
			
			
			if (adFirstPart.contains("https://www.") && contain2Dots) {
				s.push(ad);
				JOptionPane.showMessageDialog(null, "O endereço <" + ad + "> foi adicionado ao histórico");
			} else {
				JOptionPane.showMessageDialog(null, "O endereço especificado não é válido");
			}
		} else {
			JOptionPane.showMessageDialog(null, "O endereço especificado não é válido");
		}
		
		
		
		
		return s;
	}

	private StringStack getLastAddress(StringStack s) {
		if (s.size() > 0) {
			JOptionPane.showMessageDialog(null, "O último endereço visitado foi: " + s.top());
		} else {
			JOptionPane.showMessageDialog(null, "O histórico está vazio");
		}
		
		return s;
	}

	private StringStack removeLastAddress(StringStack s) {
		if (s.size() > 0) {
			JOptionPane.showMessageDialog(null, "O endereço <" + s.pop() + "> foi removido do histórico");
		} else {
			JOptionPane.showMessageDialog(null, "O histórico está vazio");
		}
		
		return s;
	}
}
