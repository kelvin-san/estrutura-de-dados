package controller;

import br.edu.fateczl.IntStack;

public class ConvertingController {

	public ConvertingController() {
		super();
	}
	
	public String decToBin(int n) {
		IntStack s = new IntStack();
		String bin = "";
		
		do {
			s.push(n%2);
			n = n / 2;
		} while (n > 0);
		
		for (int i = s.size(); i != 0; i--) {
			bin += String.valueOf(s.pop());
		}
		
		return bin;
	}

}
