package controller;

import model.Client;
import br.edu.fateczl.filaobj.Fila;

public class OperationController {

	public OperationController() {
		super();
	}
	
	public void calc(Fila q) {
		int qSize = q.size();
		
		System.out.println("NOME\t\t\tVALOR\n");
		try {
			for (int i = 0; i < qSize; i++) {
				Client c;
				c = (Client) q.remove();
			
				String name = c.getName();
				int qtt = c.getQttItems();
				Double value = c.getItemValue();
				Double total = qtt * value;
				
				System.out.println(name + "\t\t" + "R$ " + String.format("%.2f", total));
			}
			
		} catch (Exception e) {
			System.err.println("A fila nao esta corretamente populada;");
			
		}
	}
}
