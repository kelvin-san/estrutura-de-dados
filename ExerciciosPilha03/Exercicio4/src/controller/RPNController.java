package controller;

import javax.swing.JOptionPane;
import br.edu.fateczl.pilhaint.Pilha;

public class RPNController {
	
	private Pilha calcStack = new Pilha();
	private int n1, n2;
	
	public RPNController() {
		super();
	}
	
	public void menu() {
		String v = "";
		do {
			v = JOptionPane.showInputDialog("INSIRA VALORES OU OPERAÇÃO\n\n" + calcStack.toString() + "\n");
			if (v != null) {
				if (v.intern() == "") {
					JOptionPane.showMessageDialog(null, "Digite um valor ou operação");
				} else {
					checkString(v);					
				}
			}
			
		} while (v != null);
			
	}
	
	public void checkString(String v) {
		try {
			int n = Integer.parseInt(v);
			addNumber(n);
			
		} catch (NumberFormatException e) {
			if (calcStack.size() >= 2) {
				execCalc(v); 
				
			} else {
				JOptionPane.showMessageDialog(null, "Não há valores suficiente para operar");
				
			}
			
			
		}
		
	}

	private void addNumber(int n) {
		calcStack.push(n);
		
	}
	
	private void execCalc(String op) {
		int r = 0;
		switch (op) {
			case "+":
				getValues();
				r = n2 + n1;
				calcStack.push(r);
				break;
			case "-":
				getValues();
				r = n2 - n1;
				calcStack.push(r);
				break;
			case "*":
				getValues();
				r = n2 * n1;
				calcStack.push(r);
				break;
			case "/":
				getValues();
				r = n2 / n1;
				calcStack.push(r);
				break;
			default:
				JOptionPane.showMessageDialog(null,"' " + op + " ' não é uma operação válida");
			}
		
	}
	
	private void getValues() {
		try {
			n1 = calcStack.pop();
			n2 = calcStack.pop();
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}
		
	}
	
}
