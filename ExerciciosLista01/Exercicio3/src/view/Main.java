package view;

import br.edu.fateczl.IntList;
import controller.ListController;

public class Main {

	public static void main(String[] args) {
		ListController controller = new ListController();
		IntList l = new IntList();
		int v[] = {3, 5, 18, 12, 9, 7, 6, 2, 13, 4, 16};
		int vSize = v.length;
		
		for (int i = 0; i < vSize; i++) {
			try {
				l.addLast(v[i]);
			} catch (Exception e) {
				e.printStackTrace();
			}			
		}
		
		l = controller.invertList(l);
		
		System.out.println("LISTA INVERTIDA:");
		for (int i = 0; i < vSize; i++) {
			try {
				System.out.print(l.get(i) + " ");
			} catch (Exception e) {
				e.printStackTrace();
			}			
		}
		System.out.println("\n");
		
	}

}
