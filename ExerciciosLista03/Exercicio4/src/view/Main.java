package view;

import br.edu.fateczl.IntList;
import controller.ListController;

public class Main {

	public static void main(String[] args) throws Exception {
		ListController ctrl = new ListController();
		IntList list = new IntList();
		
		// Lista com números de 1-10
		for (int i = 1; i <= 10; i++) {
			list.addLast(i);
		}
		
		
		int result[] = ctrl.get2Biggers(list);
		System.out.println(result[0] + ", " + result[1]);
	}

}
