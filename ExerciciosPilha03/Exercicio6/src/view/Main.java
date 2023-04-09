package view;

import br.edu.fateczl.StringStack;
import controller.HistoryController;

public class Main {

	public static void main(String[] args) {
		
		StringStack History = new StringStack();
		
		HistoryController h = new HistoryController();
		
		History = h.menu(History);

	}

}
