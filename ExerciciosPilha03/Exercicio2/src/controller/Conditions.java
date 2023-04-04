package controller;

import br.edu.fateczl.pilhaint.Pilha;

public class Conditions {

	public Conditions() {
		super();
	}
	
	public int execConditions(int[] v) {
		Pilha stack = new Pilha();
		int n1 = 0;
		int n2 = 0;
		
		for (int i : v) {
			if (i >= 0) {
				stack.push(i);
			} else {
				try {
					n1 = stack.pop();
					n2 = stack.pop();
				} catch (Exception e) {
					e.printStackTrace();
				}
				
				
				stack.push(i);
				stack.push(n1 + n2);
			}
		}
		
		return stack.size();
	}
	
}
