package controller;

import br.edu.fateczl.IntList;

public class ListController {

	public ListController() {
		super();
	}
	
	public IntList invertList(IntList l) {
		IntList auxList = new IntList();
		
		int size = l.size();
		for (int i = (size - 1); i >= 0; i--) {
			try {
				auxList.addLast(l.get(i));
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		return auxList;
	}

}
