package controller;

import br.edu.fateczl.IntList;

public class ListController {

	public ListController() {
		super();
	}
	
	public int[] get2Biggers(IntList l) throws Exception {
		int lSize = l.size();
		int r[] = {l.get(0), l.get(0)};
		int aux;
		
		for (int i = 0; i < lSize; i++) {
			if (l.get(i) > r[0]) {
				aux = r[0];
				r[0] = l.get(i);
				r[1] = aux;
			} else if (l.get(i) > r[1]) {
				r[1] = l.get(i);
			}
		}
		
		return r;
	}
	
}
