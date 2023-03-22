package controller;

import br.edu.fateczl.pilhaint.Pilha;

public class FatController {

	public FatController() {
		super();
	}
	
	public int FatByStack(int n) {
		int acc = 1;
		Pilha s = new Pilha();
		
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
		
		return acc;
	}

}
